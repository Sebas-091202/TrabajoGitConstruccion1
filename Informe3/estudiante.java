public class Estudiante {

    // Atributos
    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;

    // Constructor por defecto
    public Estudiante() {
        nombre = "Sin nombre";
        edad = 0;
        carrera = "Sin carrera";
        promedio = 0.0;
    }

    // Constructor con parámetros
    public Estudiante(String nombre, int edad,
                      String carrera, double promedio) {

        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Métodos
    public void aumentarPromedio(double puntos) {

        promedio += puntos;

        if (promedio > 5.0) {
            promedio = 5.0;
        }
    }

    public void disminuirPromedio(double puntos) {

        promedio -= puntos;

        if (promedio < 0) {
            promedio = 0;
        }
    }

    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
        System.out.println("-----------------------------------");
    }
}