import java.util.ArrayList;

public class SportvereineModel {
	
	//private Sportverein[] sportvereine = new Sportverein[2];
	
	private ArrayList<Sportverein> sportvereine = new ArrayList<Sportverein>();
	
	public void fuelleSportvereine() {
//		this.sportvereine[0] = new Sportverein("Vfl Bochum", 24162, 19456);
//		this.sportvereine[1] = new Sportverein("FC Schalke 04", 173523, 150432);
		this.sportvereine.add(new Sportverein("Vfl Bochum", 24162, 19456));
		this.sportvereine.add(new Sportverein("FC Schalke 04", 173523, 150432));
	}

	public String gibSportvereineAus() {
		String ergebnis = "";
		for (Sportverein v : this.sportvereine) {
			ergebnis = ergebnis + v.toString() + "\n\n";
		}
		return ergebnis;
	}
}
