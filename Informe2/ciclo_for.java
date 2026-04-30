import java.util.Scanner;

public class ciclo_for {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        System.out.println("Números del 0 al " + numero + ":");
        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }

        System.out.println("Números pares:");
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}