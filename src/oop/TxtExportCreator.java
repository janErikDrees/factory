package oop;

public class TxtExportCreator extends Creator {

	@Override
	public Export factoryMethod() {
		return new DatenTxtExport();
	}

}
