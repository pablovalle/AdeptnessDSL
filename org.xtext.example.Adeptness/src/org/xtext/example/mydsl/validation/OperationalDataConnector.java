package org.xtext.example.mydsl.validation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class OperationalDataConnector {

	Sheet sheet;
	Map<String, Set<Double>> operationalData;

	public OperationalDataConnector() {
		try (InputStream inp = this.getClass().getClassLoader()
				.getResourceAsStream("TrainingData_MiercolesSur_trainingdata1.xlsx")) {
			Workbook wb = WorkbookFactory.create(inp);
			this.sheet = wb.getSheetAt(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean getVariableOpData(String variableName) {
		if (this.sheet == null)
			return false;
		operationalData = new HashMap<String, Set<Double>>();
		try {
			operationalData.put(variableName, this.readColumn(variableName));
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

	private Set<Double> readColumn(String variableName) throws Exception {
		Set<Double> columnValues = new HashSet<Double>();
		int columnIdx = this.getVariableIdx(variableName);

		Row row;
		Iterator<Row> rowIt = sheet.rowIterator();
		while (rowIt.hasNext()) {
			row = rowIt.next();
			if (row.getRowNum() == 0)
				continue;
			Cell cell = row.getCell(columnIdx);
			if (cell.getCellType() == CellType.NUMERIC) {
				columnValues.add(cell.getNumericCellValue());
			} else if (cell.getCellType() == CellType.BOOLEAN) {
				if (cell.getBooleanCellValue()) {
					columnValues.add(1.0);
				} else {
					columnValues.add(0.0);
				}
			} else {
				throw new Exception("Variable " + variableName + " is not boolean or numeric.");
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

	public double getMin(String variableName) {
		return Collections.min(operationalData.get(variableName));
	}

	public double getMax(String variableName) {
		return Collections.max(operationalData.get(variableName));
	}
}