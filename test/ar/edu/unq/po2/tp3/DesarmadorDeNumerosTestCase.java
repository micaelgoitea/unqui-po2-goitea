package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class DesarmadorDeNumerosTestCase {

	@Test
	public void testNumeroConMayorCantidadDePares() {
		DesarmadorDeNumeros desarmador = new DesarmadorDeNumeros();
		List<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(1324);
        listaNumeros.add(433);
        listaNumeros.add(1111);
        assertEquals(desarmador.numeroConMayorCantDePares(listaNumeros),1324);
	}
}