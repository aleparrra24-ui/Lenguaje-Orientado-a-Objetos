//ANA ALEJANDRA PARRA ALMAGUER
//00595316
//TI
#include <iostream>
using namespace std;

class Factura {
    
public: 
    string numPieza;
    string descripcion;
    int cantidad;
    double precio;
    
    //Constructor
    Factura(){
        numPieza = "";
        descripcion = "";
        cantidad = 0;
        precio = 0.0;
        
    }
    
    //Metodo para obtener la Factura
    double obtenerMontoFactura(){
        //regresa el contenido cuandp es invocado
        return cantidad*precio;
    }
};

//FacturaTest
int main()
{
    //Prueba con datos válidos unidades y precio del artículo
    Factura ferre;
    cout << "Num pieza: "; cin >> ferre.numPieza;
    cout << "Descripcion: "; cin >> ferre.descripcion;
    cout << "Cantidad: "; cin >> ferre.cantidad;
    cout << "Precio: "; cin >> ferre.precio;
    
    if (ferre.precio<0) ferre.precio = 0.0;
    if (ferre.cantidad<0) ferre.cantidad = 0;
    
    cout << "Factura: " << ferre.obtenerMontoFactura() << endl;

    return 0;
}