
import java.util.Scanner;

public class MetodosMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();

        System.out.println(Math.abs(num));
        System.out.println(Math.sqrt(num));
        System.out.println(Math.pow(num, 2));
        System.out.println(Math.round(num));
        System.out.println(Math.ceil(num));
        System.out.println(Math.floor(num));
        System.out.println(Math.max(num, 10));
        System.out.println(Math.min(num, 10));
        System.out.println(Math.random());
        System.out.println(Math.sin(num));

        scanner.close();
    }
}