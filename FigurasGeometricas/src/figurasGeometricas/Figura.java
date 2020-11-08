package figurasGeometricas;

public abstract class Figura implements Movible {
	
	private Punto ubicacion;
	private String color;
	
	public Figura(Punto ubi, String color) {
		this.color=color;
		this.ubicacion=ubi;
	}
	
	public abstract double getArea();
	
	public String getColor() {
		return this.color;
	}

	public Punto getUbicacion() {
		return ubicacion;
	}


	
	
	
	
}
