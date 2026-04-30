import java.util.Scanner;

public class solicitar_palabra {

    public static void main(String[] args) {

        Scanner palabra = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String texto = palabra.nextLine();

        int cantidad = texto.length();

        System.out.println("La cantidad de caracteres es: " + cantidad);

        palabra.close();
    }
}