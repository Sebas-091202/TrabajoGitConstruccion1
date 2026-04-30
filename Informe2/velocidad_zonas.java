import java.util.Scanner;

public class velocidad_zonas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int velocidad;

        System.out.print("Ingrese la velocidad: ");
        velocidad = sc.nextInt();

        if (velocidad <= 30) {
            System.out.println("Zona escolar");
        } else if (velocidad <= 60) {
            System.out.println("Zona urbana");
        } else {
            System.out.println("Carretera");
        }

        sc.close();
    }
}