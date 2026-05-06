import java.util.Scanner;

public class contar_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, contador = 0;

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 7 == 0) {
                contador++;
            }
        }

        System.out.println("El 7 está contenido en el " + numero + ", " + contador + " veces");

        sc.close();
    }
}