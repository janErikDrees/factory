public class Sportverein {
	private String name;
	private int anzahlMitglieder;
	private int anzahlAktiveMitglieder;


	@Override
	public String toString() {
//		String ergebnis = this.getName() + "\n" + this.getAnzahlMitglieder() + "\n" + this.getAnzahlAktiveMitglieder();
		String str = String.format("%s%n%d%n%d%n", this.getName(), this.getAnzahlMitglieder(), 
				this.getAnzahlAktiveMitglieder());
		return str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAnzahlMitglieder() {
		return anzahlMitglieder;
	}

	public void setAnzahlMitglieder(int anzahlMitglieder) {
		this.anzahlMitglieder = anzahlMitglieder;
	}

	public int getAnzahlAktiveMitglieder() {
		return anzahlAktiveMitglieder;
	}

	public void setAnzahlAktiveMitglieder(int anzahlAktiveMitglieder) {
		this.anzahlAktiveMitglieder = anzahlAktiveMitglieder;
	}

	public Sportverein(String name, int anzahlMitglieder, int anzahlAktiveMitglieder) throws IllegalArgumentException {
		super();
		this.name = name;
		this.anzahlMitglieder = anzahlMitglieder;
		this.anzahlAktiveMitglieder = anzahlAktiveMitglieder;
		
		if(anzahlMitglieder < anzahlAktiveMitglieder) {
			throw new IllegalArgumentException("Die Anzahl der aktiven Mitglieder darf nicht größer sein als die Anzahl der Mitglieder");
		}
	}
	
	
}

