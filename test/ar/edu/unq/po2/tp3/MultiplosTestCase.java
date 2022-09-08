package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MultiplosTestCase {

	@Test
	void testMultiploMasAltoEntreCeroYMil() {
		Multiplos multiplo = new Multiplos();
		assertEquals(multiplo.multiploMayorEntre(3, 9), 999);
	}
}