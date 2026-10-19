package oop;

import java.io.BufferedWriter;
import java.util.List;
import java.io.*;

public class DatenCsvExport extends Export {

	@Override
	public void schreibeTeppicheInDatei(List<Teppich> teppiche) throws IOException {
		BufferedWriter aus = new BufferedWriter(new FileWriter("Teppiche.csv"));
//		for(int i =  0; i < teppiche.length; i++) {
//			aus.write(teppiche[i].gibAttributeAus(";")+ "\n");
//			System.out.print(teppiche[i].gibAttributeAus(";") + "\n");
//		}
		for(Teppich teppich: teppiche) {
			aus.write(teppich.gibAttributeAus(";")+ "\n");
		}
		aus.close();

	}

}
