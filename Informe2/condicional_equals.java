import java.util.Scanner;

public class condicional_equals{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra1, palabra2;

        System.out.print("Ingrese la primera palabra: ");
        palabra1 = sc.nextLine();

        System.out.print("Ingrese la segunda palabra: ");
        palabra2 = sc.nextLine();

        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras son diferentes");
        }

        sc.close();
    }
}