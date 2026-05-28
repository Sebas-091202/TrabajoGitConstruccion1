
public class OperadoresLogicos{
	
    public static void main(String[] args) {


        // Negación: invierte el valor
        System.out.println("Negación: " + (!false) + " | " + (!(5 == 5)));

        // OR: verdadero si al menos uno es verdadero
        System.out.println("OR: " + (true | false) + " | " + ((5 == 5) | (5 < 4)));

        // XOR: verdadero si solo uno es verdadero
        System.out.println("XOR: " + (true ^ false) + " | " + ((5 == 5) ^ (5 < 4)));

        // AND: verdadero si ambos son verdaderos
        System.out.println("AND: " + (true & false) + " | " + ((5 == 5) & (5 < 4)));

        // OR lógico: evalúa solo lo necesario
        System.out.println("OR lógico: " + (true || false) + " | " + ((5 == 5) || (5 < 4)));

        // AND lógico: evalúa solo lo necesario
        System.out.println("AND lógico: " + (true && false) + " | " + ((5 == 5) && (5 < 4)));
    }
}