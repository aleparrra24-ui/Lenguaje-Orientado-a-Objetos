//ANA ALEJNADRA PARRA
//ING TI.
//00595316
//PROBLEMA 2 EMPLEADO JAVA

public class Empleado {
    String primerNombre;
    String apellidoPaterno;
    double salarioMensual;

    //Constructor
    public Empleado(String nombre, String apellido, double salario) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        
        if (salario > 0.0) {
            salarioMensual = salario;
        } else {
            salarioMensual = 0.0;
        }
    }

    //Método
    public double salarioAnual() {
        return salarioMensual * 12;
    }
}