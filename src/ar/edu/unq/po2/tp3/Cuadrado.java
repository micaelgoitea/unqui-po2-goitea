package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo{

	public Cuadrado(Point puntoDeCoordenada, int ancho, int alto) {
		super(alto, ancho, puntoDeCoordenada);
	}
	
	public Cuadrado (Point punto, int lado) {
		this(punto, lado, lado);
	}
}