import java.util.Scanner;

public class MayusAMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra en mayúsculas: ");
        String palabra = sc.nextLine();

        System.out.println(palabra.toLowerCase());

        sc.close();
    }
}