package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTestCase {

	@Test
	void testUnRectanugloSeDibujaEnElPunto4X8YCon6DeLargoY8DeAncho() {
		Point puntoDeCoordenada = new Point(4, 8);
		Rectangulo rectangulo = new Rectangulo(6, 8, puntoDeCoordenada);
		assertEquals(rectangulo.getAlto(), 6);
		assertEquals(rectangulo.getAncho(), 8);
		assertEquals(rectangulo.getPuntoDeCoordenada(), puntoDeCoordenada);
	}
	
	@Test
	void testPodemosCalcularElAreaDeUnRectangulo() {
		Point puntoDeCoordenada = new Point(4, 8);
		Rectangulo rectangulo = new Rectangulo(10, 16, puntoDeCoordenada);
		assertEquals(rectangulo.getArea(), 160);
	}
	
	@Test
	void testPodemosCalcularElPerimetroDeUnRectangulo() {
		Point puntoDeCoordenada = new Point(4, 8);
		Rectangulo rectangulo = new Rectangulo(10, 16, puntoDeCoordenada);
		assertEquals(rectangulo.getPerimetro(), 52);
	}
	
	@Test
	void testPodemosSaberSiUnTrianguloEsHorizontalPorLoTantoNoEsVertical() {
		Point puntoDeCoordenada = new Point(4, 8);
		Rectangulo rectangulo = new Rectangulo(10, 16, puntoDeCoordenada);
		assertEquals(rectangulo.esHorizontal(), true);
		assertEquals(rectangulo.esVertical(), false);
	}
	
	@Test
	void testPodemosSaberSiUnTrianguloEsVerticalPorLoTantoNoEsHorizontal() {
		Point puntoDeCoordenada = new Point(4, 8);
		Rectangulo rectangulo = new Rectangulo(16, 10, puntoDeCoordenada);
		assertEquals(rectangulo.esVertical(), true);
		assertEquals(rectangulo.esHorizontal(), false);
	}
}
