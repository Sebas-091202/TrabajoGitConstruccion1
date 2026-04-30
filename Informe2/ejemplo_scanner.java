import java.util.Scanner;

public class ejemplo_scanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años");

        sc.close();
    }
}