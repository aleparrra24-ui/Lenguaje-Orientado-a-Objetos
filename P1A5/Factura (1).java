//ANA ALEJANDRA PARRA ALMAGUER
//00595316
//TI
public class Factura
{
    //Atributo (Valores instacias sinónimo de atributos)
	String numPieza;
	String descripcion;
	int cantidad;
	double precio;
	
	Factura() { //Cosntructor que inicializa las 4 variables instancias --- un constructor no lleva void
	    numPieza = "";
	    descripcion = "";
	    cantidad = 0;
	    precio = 0.0;
	}
	
	//Cuando un método pide mostrar un dato --- se usa double y no void-- con void no lleva return
	double obtenerMontoFactura() {
	    return cantidad*precio;
	}
}
