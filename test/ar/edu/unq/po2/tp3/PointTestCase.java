package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTestCase {

	@Test
	void testPointConXCeroEYCero() {
		Point punto = new Point();
		assertEquals(punto.getX(), 0);
		assertEquals(punto.getY(), 0);
	}
	
	@Test
	void testPointConValoresXEY() {
		Point punto = new Point(5, 10);
		assertEquals(punto.getX(), 5);
		assertEquals(punto.getY(), 10);
	}
	
	@Test
	void testPointConValoresXEYSeMueveDeCoordenada() {
		Point punto = new Point(5, 10);
		punto.moverPuntoA(8, 15);
		assertEquals(punto.getX(), 8);
		assertEquals(punto.getY(), 15);
	}
	
	@Test
	void testUnPuntoPuedeSumarseConOtroPuntoYObtenerOtroPuntoDistinto() {
		Point punto = new Point(5, 10);
		Point puntoASumarse = new Point (4, 6);
		assertEquals(punto.sumarseConOtroPunto(puntoASumarse).getX(), 9);
		assertEquals(punto.sumarseConOtroPunto(puntoASumarse).getY(), 16);
	}
}