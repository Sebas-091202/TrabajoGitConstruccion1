import java.util.Scanner;

public class ejericios_while {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int)(Math.random() * 20) + 1;
        int intento = 0;
        int numeroUsuario = 0;

        while (numeroUsuario != numeroSecreto) {
            System.out.print("Adivina el número (1-20): ");
            numeroUsuario = sc.nextInt();
            intento++;

            if (numeroUsuario != numeroSecreto) {
                System.out.println("Volver a intentarlo");
            }
        }

        System.out.println("¡Ganaste!");
        System.out.println("Número de intentos: " + intento);

        sc.close();
    }
}