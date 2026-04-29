import java.util.Scanner;

public class BooleanParseBoolean {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un valor (true/false): ");
        String dato = sc.nextLine();

        boolean valor = Boolean.parseBoolean(dato);

        System.out.println("El valor es: " + valor);

        sc.close();
    }
}