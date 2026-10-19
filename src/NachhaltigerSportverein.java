
public class NachhaltigerSportverein extends Sportverein {
	
	private boolean setztSolarthermieEin;
	private boolean setztPhotovoltaikEin;

	public String toString() {
		String str = String.format("%s%b%n%b%n", super.toString(), this.isSetztSolarthermieEin(), this.isSetztPhotovoltaikEin());
		return str;
		}

	public boolean isSetztSolarthermieEin() {
		return setztSolarthermieEin;
	}

	public void setSetztSolarthermieEin(boolean setztSolarthermieEin) {
		this.setztSolarthermieEin = setztSolarthermieEin;
	}

	public boolean isSetztPhotovoltaikEin() {
		return setztPhotovoltaikEin;
	}

	public void setSetztPhotovoltaikEin(boolean setztPhotovoltaikEin) {
		this.setztPhotovoltaikEin = setztPhotovoltaikEin;
	}

	public NachhaltigerSportverein(String name, int anzahlMitglieder, int anzahlAktiveMitglieder, boolean solar, boolean photo) {
		super(name, anzahlMitglieder, anzahlAktiveMitglieder);
		// TODO Auto-generated constructor stub
		this.setztPhotovoltaikEin = photo;
		this.setztSolarthermieEin = solar;
	}

	
	
	

}
