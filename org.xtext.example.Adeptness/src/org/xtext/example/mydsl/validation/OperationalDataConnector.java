package org.xtext.example.mydsl.validation;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class OperationalDataConnector {

	Sheet sheet;
	FormulaEvaluator evaluator;

	public OperationalDataConnector() {
		try {
			URL res = this.getClass().getClassLoader().getResource("TrainingData_MiercolesSur_trainingdata1.xlsx");
			if (res != null) {
				URLConnection resConn = res.openConnection();
				resConn.setUseCaches(false);
				InputStream inp = resConn.getInputStream();

				// caches file content
				// this.getClass().getClassLoader().getResourceAsStream("TrainingData_MiercolesSur_trainingdata1.xlsx"))
				Workbook wb = WorkbookFactory.create(inp);
				evaluator = wb.getCreationHelper().createFormulaEvaluator();
				this.sheet = wb.getSheetAt(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Double> getVariableOpData(String variableName, String type) {
		if (this.sheet == null)
			return null;
		try {
			ArrayList<Double> opData = this.readColumn(variableName);
			// timestamps in seconds
			ArrayList<Double> timestamps = this.readColumn("timestamp");

			opData = this.normalize(opData, timestamps, type);

			return opData;
		} catch (Exception e) {
//			System.out.println(e.toString());
			return null;
		}
	}

	private ArrayList<Double> readColumn(String variableName) throws Exception {
		ArrayList<Double> columnValues = new ArrayList<Double>();
		int columnIdx = this.getVariableIdx(variableName);

		Row row;
		Iterator<Row> rowIt = sheet.rowIterator();
		while (rowIt.hasNext()) {
			row = rowIt.next();
			if (row.getRowNum() == 0)
				continue;
			Cell cell = row.getCell(columnIdx);
			CellValue cellVal = evaluator.evaluate(cell);

			switch (cellVal.getCellType()) {
			case NUMERIC:
				columnValues.add(cellVal.getNumberValue());
				break;
			case BOOLEAN:
				if (cellVal.getBooleanValue()) {
					columnValues.add(1.0);
				} else {
					columnValues.add(0.0);
				}
				break;
			default:
				throw new Exception("Variable " + variableName + " is not boolean nor numeric.");
			}
		}
		return columnValues;
	}

	private int getVariableIdx(String variableName) throws Exception {
		int columnIdx = 0;
		Row row = sheet.getRow(0);
		Iterator<Cell> cellIterator = row.cellIterator();
		while (cellIterator.hasNext()) {
			Cell cell = cellIterator.next();
			if (cell.getStringCellValue().equals(variableName)) {
				return columnIdx;
			}
			columnIdx++;
		}

		throw new Exception("No data monitored for variable " + variableName);
	}

	// every second
	private ArrayList<Double> normalize(ArrayList<Double> data, ArrayList<Double> timestamps, String type) {
		if (timestamps.size() != data.size() || timestamps.size() < 2)
			return null;
		ArrayList<Double> normalizedData = new ArrayList<Double>();

		int p = 1; // 1 second

		int t0idx = 0;
		int t1idx = 1;
		Double t0 = timestamps.get(t0idx);
		Double t = t0;
		Double t1 = timestamps.get(t1idx);

		normalizedData.add(data.get(0));
		Double tlast = timestamps.get(timestamps.size() - 1);
		Double tbeflast = timestamps.get(timestamps.size() - 2);
		while (t < tlast) {
			t = t + p;

			// t must be lower than t1
			while (t1 < t && t1 < tlast) {
				t1idx++;
				t1 = timestamps.get(t1idx);
			}
			// t must be higher than t0
			while (t0 < t && timestamps.get(t0idx + 1) < t && t0 < tbeflast) {
				t0idx++;
				t0 = timestamps.get(t0idx);
			}

			normalizedData.add(this.linearInterpolation(t0, t, t1, data.get(t0idx), data.get(t1idx), type));
		}

		return normalizedData;
	}

	private Double linearInterpolation(Double t0, Double t, Double t1, Double v0, Double v1, String type) {
		Double val = (v0 * (1 - ((t - t0) / (t1 - t0))) + v1 * ((t - t0) / (t1 - t0)));
		if (type.equals("boolean")) {
			if (val < 0.5) {
				val = 0.0;
			} else {
				val = 1.0;
			}
		}
		return val;
	}

}