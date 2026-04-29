import java.util.Scanner;

public class UpperCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra en minúsculas: ");
        String palabra = sc.nextLine();

        System.out.println(palabra.toUpperCase());

        sc.close();
    }
}