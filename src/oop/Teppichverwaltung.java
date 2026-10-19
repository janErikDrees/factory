package oop;

import java.util.ArrayList;
import java.util.List;

public class Teppichverwaltung {
	
	//private Teppich[] teppiche = new Teppich[2];
	private List<Teppich> teppiche = new ArrayList<>();
	
	private void fuelleTeppiche() {
		//this.teppiche[0] = new Teppich("111_high", true, 180, 300, 590);
		//this.teppiche[1] = new OutdoorTeppich("222_low", false, 150, 270, 490, true);
		
		teppiche.add(new Teppich("111_high", true, 180, 300, 590));
		teppiche.add(new OutdoorTeppich("222_low", false, 150, 270, 490, true));
		
		Teppich teppich = new Teppich("111_high", true, 180, 300, 590);
		OutdoorTeppich outdoorTeppich = new OutdoorTeppich("222_low", false, 150, 270, 490, true);
		
		TeppichUtil<Teppich> tUTeppich = new TeppichUtil<>(teppich);
		TeppichUtil<Teppich> tUOutdoorTeppich = new TeppichUtil<>(outdoorTeppich);
		
		tUTeppich.gibAttributeUndQuadratmeterTeppichBasisInKonsoleAus();
		tUOutdoorTeppich.gibAttributeUndQuadratmeterTeppichBasisInKonsoleAus();
		
		Wert<Number> nummer = new Wert<>(1);
	}
	
	private void schreibeTeppicheInCsvDatei() {
		try {
			Creator creator = new CsvExportCreator();
			Export export = creator.factoryMethod();
			export.schreibeTeppicheInDatei(this.teppiche);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void schreibeTeppicheInTxtDatei() {
		try {
			Creator creator = new TxtExportCreator();
			Export export = creator.factoryMethod();
			export.schreibeTeppicheInDatei(this.teppiche);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Teppichverwaltung teppichverwaltung  = new Teppichverwaltung();
		teppichverwaltung.fuelleTeppiche();
		teppichverwaltung.schreibeTeppicheInCsvDatei();
		teppichverwaltung.schreibeTeppicheInTxtDatei();
	}
}
