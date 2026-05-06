import java.util.Scanner;

public class CondicionalSimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número es mayor");
        }

        sc.close();
    }
}