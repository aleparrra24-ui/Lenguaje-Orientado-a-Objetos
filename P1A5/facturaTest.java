//ANA ALEJANDRA PARRA ALMAGUER
//00595316
//TI
import java.util.Scanner;

public class facturaTest {
    public static void main(String args []) {
        Factura ferre = new Factura(); //objeto es ferre. "Factura" es el constructor
                                      //de la pagina anterior. El constructor inicaliza los atributos
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el número de pieza: ");
        ferre.numPieza = input.nextLine();
        
        System.out.println("Agrega la descripción: ");
        ferre.descripcion = input.nextLine();
        
        System.out.println("Cantidad: ");
        ferre.cantidad = input.nextInt();
        
        System.out.println("Precio: ");
        ferre.precio = input.nextDouble();
        
        if (ferre.precio<0) ferre.precio = 0.0;
        if (ferre.cantidad<0) ferre.cantidad = 0;
        
        System.out.println("Factura: "+ferre.obtenerMontoFactura());
    }
}