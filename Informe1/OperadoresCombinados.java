package Informe1;

public class OperadoresCombinados {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Suma Combinada
		int a = 50;
		int b = 50;
		a+= b = a; // b= b+a
		
		System.out.println( "La suma de a=50 y a + b es = " +a);
		System.out.println("");
		
		//Resta Combinada
		int c = 50;
		int d = 50;	
		c-=d = c; // d= d-c
				
		System.out.println( "La resta de a=50 y a - b es = " +c);
		System.out.println("");
				
		//Multiplicación Combinada
		int e = 50;
		int f = 50;	
		e*=f = e; // f= f*e
				
		System.out.println( "La multiplicación de a=50 y a * b es = " +e);
		System.out.println("");
				
		//División Combinada
		int g = 50;
		int h = 50;
		g/=h = g; // h= h/g
				
		System.out.println( "La división de a=50 y a / b es = " +g);
		System.out.println("");
				
		//Módulo Combinado
		int i = 50;
		int j = 50;	
		i=j = i; // j= j % i 
				
				System.out.println( "El módulo de a=50 y a % b es = " +i +"%");

	}

}
