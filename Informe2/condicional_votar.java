import java.util.Scanner;

public class condicional_votar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println(nombre + ", puedes votar");
        } else {
            System.out.println(nombre + ", no puedes votar");
        }

        sc.close();
    }
}