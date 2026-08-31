//ANA ALEJANDRA PARRA
//ING. TI.
//0595316
//FECHA c++
#include <iostream>
using namespace std;

class Fecha {
public:
    int mes;
    int dia;
    int anio;

    Fecha(int m, int d, int a) {
        mes = m;
        dia = d;
        anio = a;
    }

    void mostrarFecha() {
        cout << mes << "/" << dia << "/" << anio << endl;
    }
};

int main() {
    
    Fecha miFecha(8, 30, 2026);

    cout << "La fecha es: ";
    miFecha.mostrarFecha();

    return 0;
}