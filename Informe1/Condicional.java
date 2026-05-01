

public class Condicional {
	public static void main(String[] args) {

       // Operadores condicionales

        int a1 = 4;
        int b1;

        // Ejemplo 1 de la guía
        b1 = (a1 == 4) ? a1 + 5 : 6 - a1;
        System.out.println("Expresión: b = a == 4 ? a + 5 : 6 - a");
        System.out.println("Resultado obtenido: " + b1);

        int a2 = 4;
        int b2;

        // Ejemplo 2 de la guía
        b2 = (a2 > 4) ? a2 * 7 : a2 + 8;
        System.out.println("Expresión: b = a > 4 ? a * 7 : a + 8");
        System.out.println("Resultado obtenido: " + b2);
    }

}
