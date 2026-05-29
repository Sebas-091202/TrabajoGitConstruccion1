public class Libro {

    // Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;
    private String genero;

    // Constructor por defecto
    public Libro() {
        titulo = "Sin título";
        autor = "Desconocido";
        anioPublicacion = 0;
        disponible = true;
        genero = "No especificado";
    }

    // Constructor básico
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
        this.genero = "General";
    }

    // Constructor completo
    public Libro(String titulo, String autor, int anioPublicacion,
                 boolean disponible, String genero) {

        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
        this.genero = genero;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getGenero() {
        return genero;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Métodos de comportamiento
    public void prestarLibro() {

        if (disponible) {
            disponible = false;
            System.out.println("Libro prestado correctamente.");
        } else {
            System.out.println("El libro ya se encuentra prestado.");
        }
    }

    public void devolverLibro() {
        disponible = true;
        System.out.println("Libro devuelto correctamente.");
    }

    public int calcularAntiguedad() {
        return 2026 - anioPublicacion;
    }

    public void mostrarInformacion() {

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Género: " + genero);
        System.out.println("Disponible: " + disponible);
        System.out.println("Antigüedad: " + calcularAntiguedad() + " años");
        System.out.println("-----------------------------------");
    }
}