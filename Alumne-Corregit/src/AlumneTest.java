import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AlumneTest {
	Alumne alum1;
	Alumne alum2;
	Alumne alum3;

	@Before
	public void setUp() throws Exception {
		alum1 = new Alumne("Pol", 24, 2017, 3, 8);
		alum2 = new Alumne("Samuel", 18, 2007, 7, 3);
		alum3 = new Alumne("David", 17, 2016, 5, 2);
	}

	@Test
	public void testEsMajorEdat() {
		assertTrue("Alumne 1 no es major d'edat, i havia de ser-ho", alum1.esMajorEdat());
		assertTrue("Alumne 2 no es major d'edat, i havia de ser-ho", alum2.esMajorEdat());
		assertFalse("Alumne 3 es major d'edat, i no havia de ser-ho", alum3.esMajorEdat());
	}

	@Test
	public void testAprovaM5() {
		assertFalse("Aprova, i no havia d'aprovar per la nota", alum1.aprovaM5(80));
		assertFalse("Aprova, i no havia d'aprovar per l'assistencia", alum2.aprovaM5(75));		
		assertTrue("No aprova, i havia d'aprovar", alum2.aprovaM5(85)); 
		
	}

	@Test
	public void testAnysMatriculat() {
		assertEquals("Havien de ser 1", 1, alum1.anysMatriculat(2018));
		assertEquals("Havien de ser 11", 11, alum2.anysMatriculat(2018));
		assertEquals("Havien de ser 2", 2, alum3.anysMatriculat(2018));
	}

	@Test
	public void testPassaASegon() {
		assertTrue("No passa a segon, i havia de passar", alum1.passaASegon());
		assertFalse("Passa a segon, i no havia de passar", alum2.passaASegon());
	}

}
