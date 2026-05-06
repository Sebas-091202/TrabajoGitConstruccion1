import java.util.Scanner;

public class Contains {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.print("Ingrese palabra a buscar: ");
        String buscar = sc.nextLine();

        System.out.println(frase.contains(buscar));

        sc.close();
    }
}
