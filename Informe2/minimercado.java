import java.util.Scanner;

public class minimercado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dia, producto;
        double precio, descuento = 0;

        System.out.print("Ingrese el día: ");
        dia = sc.nextLine().toLowerCase();

        System.out.print("Ingrese el producto (fruver, carnes, vinos): ");
        producto = sc.nextLine().toLowerCase();

        System.out.print("Ingrese el precio: ");
        precio = sc.nextDouble();

        switch (dia) {

            case "lunes":
                if (producto.equals("fruver")) descuento = 0.30;
                break;

            case "martes":
                if (producto.equals("carnes")) descuento = 0.30;
                break;

            case "jueves":
                if (producto.equals("vinos")) descuento = 0.30;
                break;

            case "miercoles":
                if (producto.equals("carnes")) descuento = 0.15;
                else if (producto.equals("fruver")) descuento = 0.10;
                else if (producto.equals("vinos")) descuento = 0.05;
                break;

            case "viernes":
                if (producto.equals("vinos")) descuento = 0.15;
                else if (producto.equals("fruver")) descuento = 0.10;
                else if (producto.equals("carnes")) descuento = 0.05;
                break;

            default:
                System.out.println("No hay descuentos este día");
        }

        double total = precio - (precio * descuento);

        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Total a pagar: " + total);

        sc.close();
    }
}