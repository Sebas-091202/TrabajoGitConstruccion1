import java.util.Scanner;

public class Trim {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto con espacios: ");
        String texto = sc.nextLine();

        System.out.println(texto.trim());

        sc.close();
    }
}
