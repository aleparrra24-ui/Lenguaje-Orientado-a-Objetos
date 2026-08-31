#ANA ALEJANDRA PARRA
#ING. TI.
#0595316
#FECHA PYTHON

class Fecha:
    
    def __init__(self, m, d, a):
        self.mes = m
        self.dia = d
        self.anio = a

    def mostrarFecha(self):
        print(str(self.mes) + "/" + str(self.dia) + "/" + str(self.anio))


mi_fecha = Fecha(8, 30, 2026)

print("La fecha es: ", end="")
mi_fecha.mostrarFecha()
