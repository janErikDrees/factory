package oop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DatenTxtExport extends Export {

	@Override
	public void schreibeTeppicheInDatei(List<Teppich> teppiche) throws IOException {
		BufferedWriter aus = new BufferedWriter(new FileWriter("Teppiche.txt"));
//		for(int i =  0; i < teppiche.length; i++) {
//			aus.write(teppiche[i].gibAttributeAus(" ")+ "\n");
//			System.out.print(teppiche[i].gibAttributeAus(" ") + "\n");
//		}
		for(Teppich teppich: teppiche) {
			aus.write(teppich.gibAttributeAus(" ")+ "\n");
		}

		aus.close();
		
	}

}
