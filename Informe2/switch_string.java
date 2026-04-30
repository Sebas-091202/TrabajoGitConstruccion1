import java.util.Scanner;

public class switch_string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dia;

        System.out.print("Ingrese un día de la semana: ");
        dia = sc.nextLine().toLowerCase();

        switch (dia) {
            case "lunes":
                System.out.println("Inicio de semana");
                break;
            case "viernes":
                System.out.println("Casi fin de semana");
                break;
            case "domingo":
                System.out.println("Día de descanso");
                break;
            default:
                System.out.println("Día normal");
        }

        sc.close();
    }
}