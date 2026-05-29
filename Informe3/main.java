public class Main {

    public static void main(String[] args) {

        System.out.println("======== LIBROS ========\n");

        Libro libro1 = new Libro();

        Libro libro2 = new Libro(
                "Cien años de soledad",
                "Gabriel García Márquez",
                1967,
                true,
                "Realismo mágico"
        );

        Libro libro3 = new Libro(
                "Don Quijote de la Mancha",
                "Miguel de Cervantes",
                1605,
                true,
                "Novela"
        );

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();

        libro2.prestarLibro();
        libro2.devolverLibro();

        System.out.println("\n======== ESTUDIANTES ========\n");

        Estudiante estudiante1 = new Estudiante();

        Estudiante estudiante2 = new Estudiante(
                "Sara Bedoya",
                19,
                "Ingeniería de Sistemas",
                4.3
        );

        Estudiante estudiante3 = new Estudiante(
                "Juan Manuel",
                20,
                "Ingeniería Electrónica",
                3.8
        );

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();

        estudiante2.aumentarPromedio(0.4);
        estudiante3.disminuirPromedio(0.3);

        System.out.println("\nPromedios actualizados:\n");

        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();

        // Prueba de encapsulación
        // Descomenta la línea siguiente para observar el error:
        // libro2.titulo = "Nuevo título";

    }
}