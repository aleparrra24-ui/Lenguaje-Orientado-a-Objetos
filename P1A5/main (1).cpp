//ANA ALEJANDRA PARRA
//ING TI.
//00595316
//PROBLEMA 2 EMPLEADO C++
#include <iostream>
#include <string>

using namespace std;

class Empleado {
public:
    string primerNombre;
    string apellidoPaterno;
    double salarioMensual;

    Empleado(string nombre, string apellido, double salario) {
        primerNombre = nombre;
        apellidoPaterno = apellido;

        if (salario > 0.0) {
            salarioMensual = salario;
        } else {
            salarioMensual = 0.0;
        }
    }

    double salarioAnual() {
        return salarioMensual * 12;
    }
};


int main() {
    string nombre1, apellido1;
    double salario1;

    string nombre2, apellido2;
    double salario2;

    cout << "Nombre: ";
    cin >> nombre1;
    cout << "Apellido Paterno: ";
    cin >> apellido1;
    cout << "Salario Mensual: ";
    cin >> salario1;

    Empleado emp1(nombre1, apellido1, salario1);

    cout << "Nombre: ";
    cin >> nombre2;
    cout << "Apellido Paterno: ";
    cin >> apellido2;
    cout << "Salario Mensual: ";
    cin >> salario2;

    Empleado emp2(nombre2, apellido2, salario2);

    cout << emp1.primerNombre << " " << emp1.apellidoPaterno << ": $" << emp1.salarioAnual() << endl;
    cout << emp2.primerNombre << " " << emp2.apellidoPaterno << ": $" << emp2.salarioAnual() << endl;

    emp1.salarioMensual = emp1.salarioMensual * 1.10;
    emp2.salarioMensual = emp2.salarioMensual * 1.10;

    cout << emp1.primerNombre << " " << emp1.apellidoPaterno << ": $" << emp1.salarioAnual() << endl;
    cout << emp2.primerNombre << " " << emp2.apellidoPaterno << ": $" << emp2.salarioAnual() << endl;

    return 0;
}