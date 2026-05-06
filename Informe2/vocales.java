import java.util.Scanner;

public class vocales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto;
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        int pos = 0;

        System.out.print("Ingrese una palabra o frase: ");
        texto = sc.nextLine().toLowerCase();

        while (pos < texto.length()) {

            char letra = texto.charAt(pos);

            switch (letra) {
                case 'a': a++; break;
                case 'e': e++; break;
                case 'i': i++; break;
                case 'o': o++; break;
                case 'u': u++; break;
            }

            pos++;
        }

        System.out.println("Cantidad de vocales:");
        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);

        sc.close();
    }
}