import java.util.Scanner;

public class switch_case {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.print("Ingrese un número del 1 al 3: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Elegiste opción 1");
                break;
            case 2:
                System.out.println("Elegiste opción 2");
                break;
            case 3:
                System.out.println("Elegiste opción 3");
                break;
            default:
                System.out.println("Opción no válida");
        }

        sc.close();
    }
}