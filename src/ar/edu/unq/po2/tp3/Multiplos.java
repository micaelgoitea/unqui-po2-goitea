package ar.edu.unq.po2.tp3;

public class Multiplos {
	
	public int multiploMayorEntre(int numero1, int numero2) {
		int multiploMasAlto = -1;
		for (int i=0; i <= 1000; i++) {
			if (esMultiploDe(i, numero1, numero2)) {
				multiploMasAlto = i;
			}
		}
		
		return multiploMasAlto;
	}
	
	private boolean esMultiploDe(int numeroADividir, int divisor1, int divisor2) {
		
		return (numeroADividir % divisor1 == 0) && (numeroADividir % divisor2 == 0);
	}
}