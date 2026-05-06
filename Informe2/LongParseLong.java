import java.util.Scanner;

public class LongParseLong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número largo: ");
        String num = sc.nextLine();

        long valor = Long.parseLong(num);

        System.out.println(valor);

        sc.close();
    }
}