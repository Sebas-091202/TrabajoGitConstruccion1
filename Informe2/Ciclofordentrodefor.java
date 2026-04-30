import java.util.Scanner;

public class Ciclofordentrodefor {

    public static void main(String[] args) {

        Scanner multi = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 10: ");
        int numero = multi.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número fuera de rango.");
        } else {

            for (int i = numero; i <= numero; i++) {
                System.out.println("Tabla del " + i + ":");

                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
            }
        }

        multi.close();
    }
}