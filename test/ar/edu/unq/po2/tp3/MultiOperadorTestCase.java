package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class MultiOperadorTestCase {

	@Test
	void testSuma() {
		Multioperador multioperador = new Multioperador();
		List<Integer> listaNumerosASumar = new ArrayList<Integer>();
		listaNumerosASumar.add(4);
		listaNumerosASumar.add(5);
		listaNumerosASumar.add(6);
		assertEquals(multioperador.suma(listaNumerosASumar), 15);
	}
	
	@Test
	void testMultiplicacion() {
		Multioperador multioperador = new Multioperador();
		List<Integer> listaNumerosASumar = new ArrayList<Integer>();
		listaNumerosASumar.add(4);
		listaNumerosASumar.add(5);
		listaNumerosASumar.add(6);
		assertEquals(multioperador.multiplicacion(listaNumerosASumar), 120);
	}
	
	@Test
	void testResta() {
		Multioperador multioperador = new Multioperador();
		List<Integer> listaNumerosARestar = new ArrayList<Integer>();
		listaNumerosARestar.add(30);
		listaNumerosARestar.add(15);
		assertEquals(multioperador.resta(listaNumerosARestar), 15);
	}
}
