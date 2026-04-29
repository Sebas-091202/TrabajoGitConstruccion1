import java.util.Scanner;

public class IntegerParseInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero (Ej: 30): ");
        String num = sc.nextLine();

        int valor = Integer.parseInt(num);

        System.out.println(valor);

        sc.close();
    }
}