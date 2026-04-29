import java.util.Scanner;

public class ErrorFormatoNumerico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            int numero = Integer.parseInt(sc.nextLine());

            System.out.println("Número ingresado: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido.");
        }

        sc.close();
    }
}