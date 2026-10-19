package oop;

public class CsvExportCreator extends Creator {

	@Override
	public Export factoryMethod() {
		return new DatenCsvExport();
	}

}
