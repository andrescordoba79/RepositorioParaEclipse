package figurasGeometricas;

public class Elipse extends Figura {

	private Double a;
	private Double b;
	
	public Elipse(Punto ubi, String color, double a, double b) {
		super(ubi,color);
		this.a=a;
		this.b=b;
	}
	
	
	
	@Override
	public void mover(double deltaX, double deltaY) {
		super.getUbicacion().mover(deltaX, deltaY);

	}

	@Override
	public double getArea() {
		return a * b * Math.PI;
	}

}
