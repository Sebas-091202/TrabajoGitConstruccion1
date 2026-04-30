import java.util.Scanner;

public class switch_anidado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion, subopcion;

        System.out.print("Ingrese opción principal (1 o 2): ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Submenú 1");
                System.out.print("Ingrese subopción (1 o 2): ");
                subopcion = sc.nextInt();

                switch (subopcion) {
                    case 1:
                        System.out.println("Elegiste subopción 1");
                        break;
                    case 2:
                        System.out.println("Elegiste subopción 2");
                        break;
                    default:
                        System.out.println("Subopción inválida");
                }
                break;

            case 2:
                System.out.println("Opción 2 seleccionada");
                break;

            default:
                System.out.println("Opción inválida");
        }

        sc.close();
    }
}