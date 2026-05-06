import java.util.Scanner;

public class Posicion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();

        System.out.print("Ingrese la posición: ");
        int pos = sc.nextInt();

        System.out.println(texto.charAt(pos));

        sc.close();
    }
}