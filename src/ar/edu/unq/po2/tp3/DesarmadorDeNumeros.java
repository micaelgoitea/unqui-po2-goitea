package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;

public class DesarmadorDeNumeros {
	
	public List<Integer> numeroDesarmado(int numeroADesarmar){
		List<Integer> lista = new ArrayList<Integer>();
        while (numeroADesarmar > 0) {
            lista.add(numeroADesarmar % 10);
            numeroADesarmar = numeroADesarmar / 10;
        }
        return lista;
	}
	
	public Integer numeroConMayorCantDePares(List<Integer> listaNumeros) {
		int nroConMayorCantPares = listaNumeros.get(0);
		for (int i = 1; i < listaNumeros.size(); i++) {
			nroConMayorCantPares = numeroConMasParesEntre(nroConMayorCantPares, listaNumeros.get(i));
		}
		return nroConMayorCantPares;
	}

	public int numeroConMasParesEntre(int numero1, int numero2) {
		int numMasPares = numero1;
		if (digitosParesEn(numero2) > digitosParesEn(numMasPares)) {
			numMasPares = numero2;
		}
		return numMasPares;
	}

	public int digitosParesEn(int numero) {
		Counter contador = new Counter();
		contador.addAllNumber(numeroDesarmado(numero));
		return contador.getEvenOcurrences();
	}
}