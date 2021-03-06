package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DesarmadorDeNumerosTest {

    @Test
    public void testMultiplesOfNumbers() {

        Counter counter = new Counter();
        // Getting the odd occurrences
        DesarmadorDeNumeros.desarmarNumero(120, counter);
        // I check the amount is the expected one
        assertEquals(2, counter.getEvenOcurrences());
    }
    
    @Test
    public void testMayorNumeroConDigitoPar() {
    
        
        int[] arreglo = {254,222,76889,122434};
        int response = DesarmadorDeNumeros.mayorNumeroConDigitoPar(arreglo);
        assertEquals(122434, response);
        
    }
}