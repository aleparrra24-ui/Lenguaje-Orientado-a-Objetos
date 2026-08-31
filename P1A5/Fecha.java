//ANA ALEJANDRA PARRA
//ING. TI.
//0595316
//FECHA JAVA

class Fecha {
    int mes;
    int dia;
    int anio;

    public Fecha(int m, int d, int a) {
        mes = m;
        dia = d;
        anio = a;
    }

    public void mostrarFecha() {
        System.out.println(mes + "/" + dia + "/" + anio);
    }
}