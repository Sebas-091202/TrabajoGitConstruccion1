import java.util.Scanner;

public class Length {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba un texto: ");
        String texto = sc.nextLine();

        System.out.println("El texto tiene " + texto.length() + " caracteres.");

        sc.close();
    }
}