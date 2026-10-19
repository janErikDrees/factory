import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;



public class SportvereinTest {
	
	@Test
	public void testSportverein() throws Exception {
		Sportverein sportverein;
		sportverein = new Sportverein("Junit", 2, 0);
		Assertions.assertTrue(sportverein.getAnzahlAktiveMitglieder() == 0, "mitgliederzahl != 0");
		Assertions.assertTrue(sportverein.getAnzahlMitglieder() == 2, "mitgliederzahl != 2");
		Assertions.assertEquals(sportverein.getName() , "Junit");
	}
	
	@Test
	public void  testSportvereinException() throws Exception {
		Sportverein sportverein;
		sportverein = new Sportverein("Junit", 2, 0);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {this.blows();
		});
		
		
		
	}
	public void blows() throws IllegalArgumentException {
		throw new IllegalArgumentException();
	}
}
