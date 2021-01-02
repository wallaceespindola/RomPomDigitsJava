import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomPomTest {

	@Test
	public void testGenerateRomPomNumberFor2() {
		assertEquals("2", RomPom.generateRomPomNumber(2));
	}
	
	@Test
	public void testGenerateRomPomNumberFor4() {
		assertEquals("Rompom", RomPom.generateRomPomNumber(4));
	}
	
	@Test
	public void testGenerateRomPomNumberFor9() {
		assertEquals("Pom", RomPom.generateRomPomNumber(9));
	}
	
	@Test
	public void testGenerateRomPomNumberFor14() {
		assertEquals("Rom", RomPom.generateRomPomNumber(14));
	}
}
