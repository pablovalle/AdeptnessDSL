# Adeptness DSL Demo

## Export DSL plugin
Within Eclipse IDE: 

File -> Export -> Plug-in Development -> Deployable features -> Within Available Features select org.xtext.example.Adeptness.feature -> Within Destination tab select Archive file: click Browse, select destination folder and give a name (AdeptnessDSLplugin for example) -> Select Options tab -> Within categorize repository, click browse and select org.xtext.example.Adeptness.feature/category.xml -> click finish. 


## Install DSL plugin
Within Eclipse IDE: 

Help -> Install New Software -> Within work with click “Add...” -> Within the Add Repository wizard click “Archive…” -> Select previously exported plugin .zip -> Introduce a name within the Name field (Adeptness, for example) -> Click Add.
At the bottom, inside Details, uncheck Group items by category. Check AdeptnessDSL. Click Next ->  Click Next -> At the bottom select I accept the terms of the license agreement -> Finish -> Install anyway -> A message to Restart Eclipse will be prompted when the installation process is finished.
