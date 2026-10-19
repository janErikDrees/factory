package oop;

public class Wert<E extends Number> {
	private E wert;

	public E getWert() {
		return wert;
	}

	public void setWert(E wert) {
		this.wert = wert;
	}
	
	public Wert(E wert) {
		this.wert = wert;
	}
}

	