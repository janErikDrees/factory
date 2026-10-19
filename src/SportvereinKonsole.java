
public class SportvereinKonsole<T extends Sportverein> {
	
	private T sportvereinBasis;

	public SportvereinKonsole(T sportvereinBasis) {
		this.sportvereinBasis = sportvereinBasis;
	}
	
	public void gibAttributeInKonsoleAus() {
		
		String str = String.format("Die Werte der Attribute von %s sind die folgenden: %s", this.sportvereinBasis.getName(),
				sportvereinBasis.toString());
		System.out.println(str);;
	}
	
	
}
