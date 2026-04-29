import java.util.Scanner;

public class DivisionSimple{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese número 1: ");
            int a = sc.nextInt();

            System.out.print("Ingrese número 2: ");
            int b = sc.nextInt();

            int resultado = a / b;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }

        sc.close();
    }
}
