package oop;

public class Teppich {
	private String artikelnr;
	private boolean hochflorTeppich;
	private int breite;
	private int laenge;
	private int preis;
	
	public String gibAttributeAus(String trenner) {
		String ergebnis = this.getArtikelnr() + trenner + this.isHochflorTeppich() + trenner + this.getBreite() + trenner + this.getLaenge() + trenner + this.getPreis();
		return ergebnis;
	}

	public Teppich(String artikelnr, boolean hochflorteppich, int breite, int laenge, int preis) {
		this.setArtikelnr(artikelnr);
		this.setHochflorTeppich(hochflorteppich);
		this.setBreite(breite);
		this.setLaenge(laenge);
		this.setPreis(preis);
	}

	public String getArtikelnr() {
		return artikelnr;
	}

	public void setArtikelnr(String artikelnr) {
		this.artikelnr = artikelnr;
	}

	public boolean isHochflorTeppich() {
		return hochflorTeppich;
	}

	public void setHochflorTeppich(boolean hochflorTeppich) {
		this.hochflorTeppich = hochflorTeppich;
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}
}
