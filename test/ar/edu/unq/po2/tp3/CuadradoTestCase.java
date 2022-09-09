package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuadradoTestCase {

	@Test
	void testUnCUadradoSeDibujaEnElPunto4X8YCon6DeLado() {
		Point puntoDeCoordenada = new Point(4, 8);
		Rectangulo cuadrado = new Cuadrado(puntoDeCoordenada, 6);
		assertEquals(cuadrado.getAlto(), 6);
		assertEquals(cuadrado.getAncho(), 6);
		assertEquals(cuadrado.getPuntoDeCoordenada(), puntoDeCoordenada);
	}
	
	@Test
	void testPodemosCalcularElAreaDeUnCuadrado() {
		Point puntoDeCoordenada = new Point(4, 8);
		Rectangulo cuadrado = new Cuadrado(puntoDeCoordenada, 4);
		assertEquals(cuadrado.getArea(), 16);
	}
	
	@Test
	void testPodemosCalcularElPerimetroDeUnCuadrado() {
		Point puntoDeCoordenada = new Point(4, 8);
		Rectangulo cuadrado = new Cuadrado(puntoDeCoordenada, 4);
		assertEquals(cuadrado.getPerimetro(), 16);
	}
}