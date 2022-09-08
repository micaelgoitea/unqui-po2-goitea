package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {
	
	public int suma(List<Integer> numerosASumar) {
		int sumaTotal = 0;
		for (Integer numero : numerosASumar) {
			sumaTotal = sumaTotal + numero;
		}
		return sumaTotal;
	}
	
	public int multiplicacion(List<Integer> numerosAMultiplicar) {
		int resultadoMultiplicacion = 1;
		for (Integer numero : numerosAMultiplicar) {
			resultadoMultiplicacion = resultadoMultiplicacion * numero;
		}
		return resultadoMultiplicacion;
	}
	
	public int resta(List<Integer> numerosARestar) {
		int restaTotal = numerosARestar.get(0);
		for (int i = 1; i < numerosARestar.size(); i++) {
			restaTotal = restaTotal - numerosARestar.get(i);
		}
		return restaTotal;
	}
}