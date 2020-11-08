package figurasGeometricas;

public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Punto() {
		this(0, 0);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Punto mover(double deltaX, double deltaY) {
		return new Punto(this.getX() + deltaX, this.getY() + deltaY);

	}

	public double distancia(Punto otroPunto) {
		return Math.sqrt(Math.pow(this.getX() - otroPunto.getX(), 2) + Math.pow(this.getY() - otroPunto.getY(), 2));
	}
}
