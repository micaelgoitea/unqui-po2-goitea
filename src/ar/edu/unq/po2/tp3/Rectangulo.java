package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	private Point puntoDeCoordenada;
	private int alto;
	private int ancho;
	
	public Rectangulo(int alto, int ancho, Point puntoDeCoordenada) {
		super();
		this.setAlto(alto);
		this.setAncho(ancho);
		this.setPuntoDeCoordenada(puntoDeCoordenada);
	}

	public Point getPuntoDeCoordenada() {
		return puntoDeCoordenada;
	}

	public void setPuntoDeCoordenada(Point puntoDeCoordenada) {
		this.puntoDeCoordenada = puntoDeCoordenada;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	public int getArea() {
		return this.getAlto() * this.getAncho();
	}
	
	public int getPerimetro() {
		return ((this.getAlto() * 2) + (this.getAncho() * 2));
	}
	
	public Boolean esHorizontal() {

		return getAncho() > getAlto();
	}

	public Boolean esVertical() {

		return getAlto() > getAncho();
	}
}
