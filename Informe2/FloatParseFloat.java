import java.util.Scanner;

public class FloatParseFloat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su promedio (Ej: 3.5): ");
        String num = sc.nextLine();

        float valor = Float.parseFloat(num);

        System.out.println(valor);

        sc.close();
    }
}