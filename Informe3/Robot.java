public class Robot {
	
	// atributos del robot
	private double peso;
	private String color;
	
	// valores por defecto
	public Robot() {
		peso = 4800;
		color = "negro";
	}
	
	// parámetros
	public Robot(double peso, String color) {
		this.peso = peso;
		this.color = color;
	}
	
	// métodos del objeto (comportamiento)
	void adelante() {
		System.out.println("El Androide 18 avanzó");
	}
	
	void detenerse() {
		System.out.println("El Androide 18 se detuvo");
	}
	
	// Getters y setters
	public double getpeso() {
		return peso;
	}
	
	public void setpeso(double peso) {
		this.peso = peso;
	}
	
	public String getcolor() {
		return color;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
}