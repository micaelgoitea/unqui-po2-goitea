package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		this(0,0);
	}
	
	public Point(int x, int y) {
		super();
		this.setXY (x, y);
	}
	
	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);		
	}
	
	public void moverPuntoA(int x, int y) {
		this.setXY(x, y);
	}
	
	public Point sumarseConOtroPunto (Point puntoASumarse) {	
		return new Point(this.getX()+ puntoASumarse.getX(), this.getY() + puntoASumarse.getY());
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}