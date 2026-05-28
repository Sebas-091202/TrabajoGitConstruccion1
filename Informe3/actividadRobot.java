public class actividadRobot {

	public static void main(String[] args) {

		// Robot por defecto
		Robot Androide18 = new Robot();

		System.out.println("Androide18 es de color: "
				+ Androide18.getcolor());

		// Robot personalizado
		Robot GuerreroZ = new Robot(7850, "morado");

		System.out.println("GuerreroZ pesa: "
				+ GuerreroZ.getpeso() + "kg");

		// Modificando robot
		Androide18.setcolor("rojo");
		Androide18.setpeso(20000);

		// Nuevos valores
		System.out.println("\nAndroide18 actualizado:");
		System.out.println("Color: "
				+ Androide18.getcolor());

		System.out.println("Peso: "
				+ Androide18.getpeso() + "kg");

		// Comandos
		Androide18.adelante();
		Androide18.detenerse();
	}
}