#ANA ALEJANDRA PARRA ALMAGUER
#00595316
#TI
class Factura: 
    #Atributos incializamos en el constructor __int__
    def __init__(self):
        self.numPieza = ""
        self.descripcion = ""
        self.cantidad = 0
        self.precio = 0.0
        
    def obtenerMontoFactura(self):
        return self.cantidad*self.precio

#FacturaTest
ferre = Factura()
    
ferre.numPieza = input("Ingresa el numero de pieza: ")
ferre.descripcion = input("Descripción: ")
ferre.cantidad = int(input("Cantidad: "))
ferre.precio = float(input("Precio: "))
    
ferre.cantidad = 0 if ferre.cantidad<0 else ferre.cantidad
ferre.precio = 0.0 if ferre.precio<0 else ferre.precio
    
print("Factura: ", ferre.obtenerMontoFactura())
        