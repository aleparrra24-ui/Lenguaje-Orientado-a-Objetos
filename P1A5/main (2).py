#ANA ALEJANDRA PARRA
#ING TI.
#00595316
#PROBLEMA 2 EMPLEADO PYTHON

class Empleado:
    def __init__(self, nombre, apellido, salario):
        self.primer_nombre = nombre
        self.apellido_paterno = apellido
        
        if salario > 0.0:
            self.salario_mensual = salario
        else:
            self.salario_mensual = 0.0

    def salario_anual(self):
        return self.salario_mensual * 12
        
nombre1 = input("Nombre: ")
apellido1 = input("Apellido Paterno: ")
salario1 = float(input("Salario Mensual: "))

emp1 = Empleado(nombre1, apellido1, salario1)

nombre2 = input("Nombre: ")
apellido2 = input("Apellido Paterno: ")
salario2 = float(input("Salario Mensual: "))

emp2 = Empleado(nombre2, apellido2, salario2)

print(emp1.primer_nombre + " " + emp1.apellido_paterno + ": $" + str(round(emp1.salario_anual(), 2)))
print(emp2.primer_nombre + " " + emp2.apellido_paterno + ": $" + str(round(emp2.salario_anual(), 2)))

emp1.salario_mensual = emp1.salario_mensual * 1.10
emp2.salario_mensual = emp2.salario_mensual * 1.10

print(emp1.primer_nombre + " " + emp1.apellido_paterno + ": $" + str(round(emp1.salario_anual(), 2)))
print(emp2.primer_nombre + " " + emp2.apellido_paterno + ": $" + str(round(emp2.salario_anual(), 2)))