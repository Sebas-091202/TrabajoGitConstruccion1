public class EjercicioMatriz {
    public static void main(String[] args) {

        int numeros[][] = new int[5][4];
        int suma = 0;
        int resta = 0;
        long multiplicacion = 1;

        double division;
        double raiz;

        // Llenar matriz con números aleatorios
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 4; j++) {

                numeros[i][j] = (int) Math.ceil(Math.random() * 100);

            }
        }

        // Mostrar matriz y realizar operaciones
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 4; j++) {

                suma = suma + numeros[i][j];

                resta = resta - numeros[i][j];

                multiplicacion = multiplicacion * numeros[i][j];

                System.out.print(numeros[i][j] + " ");

            }

            System.out.println();
        }

        // División
        division = (double) multiplicacion / suma;

        // Raíz cuadrada de la suma
        raiz = Math.sqrt(suma);

        // Resultados
        System.out.println("\nLa suma es: " + suma);

        System.out.println("La resta es: " + resta);

        System.out.println("La multiplicación es: " + multiplicacion);

        System.out.println("La división es: " + division);

        System.out.println("La raíz cuadrada es: " + raiz);

    }
}