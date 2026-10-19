package oop;

public class OutdoorTeppich extends Teppich{
	private boolean wasserabweisend;
	@Override
	public String gibAttributeAus(String trenner) {
		String ergebnis = super.gibAttributeAus(trenner) + trenner + this.isWasserabweisend();
		return ergebnis;
	}
	public boolean isWasserabweisend() {
		return wasserabweisend;
	}
	public void setWasserabweisend(boolean wasserabweisend) {
		this.wasserabweisend = wasserabweisend;
	}
	public OutdoorTeppich(String artikelnr, boolean hochflorteppich, int breite, int laenge, int preis, boolean wasserabweisend) {
		super(artikelnr, hochflorteppich, breite, laenge, preis);
		this.setWasserabweisend(wasserabweisend);
	}
	
	
}
