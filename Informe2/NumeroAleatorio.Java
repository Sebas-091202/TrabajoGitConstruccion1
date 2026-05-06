import java.util.Scanner;

public class NumeroAleatorio {

    public static void main(String[] args) {

        Scanner var1 = new Scanner(System.in);
        System.out.print("Ingrese un número (1-100): ");
        int var2 = var1.nextInt();

        String var3 = "";

        for (int var4 = 0; var4 <= var2; ++var4) {
            System.out.print(var4 + " ");

            if (var4 % 2 == 0) {
                var3 = var3 + var4 + " ";
            }
        }

        System.out.println();
        System.out.println("Pares: " + var3);

        var1.close();
    }
}