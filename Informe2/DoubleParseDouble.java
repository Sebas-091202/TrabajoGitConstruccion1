import java.util.Scanner;

public class DoubleParseDouble {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese precio (Ej: 45.5): ");
        String num = sc.nextLine();

        double valor = Double.parseDouble(num);

        System.out.println(valor);

        sc.close();
    }
}