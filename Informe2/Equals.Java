import java.util.Scanner;

public class Equals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese texto 1: ");
        String a = sc.nextLine();

        System.out.print("Ingrese texto 2: ");
        String b = sc.nextLine();

        System.out.println(a.equals(b));

        sc.close();
    }
}