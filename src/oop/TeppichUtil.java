package oop;

public class TeppichUtil<T extends Teppich> {
	private T teppichbasis;
	
	public TeppichUtil(T teppich) {
		this.teppichbasis = teppich;
	}
	
	public void gibAttributeUndQuadratmeterTeppichBasisInKonsoleAus() {
		System.out.println(teppichbasis.gibAttributeAus(" "));
		int area = teppichbasis.getBreite()*teppichbasis.getLaenge();
		System.out.println("Anzahl der Quadratmeter des Teppichs: " + area);
	}
}
