import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        System.out.print("Inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Fin: ");
        int fin = sc.nextInt();

        System.out.println(palabra.substring(inicio, fin));

        sc.close();
    }
}