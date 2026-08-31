//ANA ALEJNADRA PARRA
//ING TI.
//00595316
//PROBLEMA 2 EMPLEADOtest JAVA
import java.util.Scanner;

public class EmpleadoTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre1 = entrada.next();
        
        System.out.print("Apellido Paterno: ");
        String apellido1 = entrada.next();
        
        System.out.print("Salario Mensual: ");
        double salario1 = entrada.nextDouble();

        Empleado emp1 = new Empleado(nombre1, apellido1, salario1);

        System.out.print("Nombre: ");
        String nombre2 = entrada.next();
        
        System.out.print("Apellido Paterno: ");
        String apellido2 = entrada.next();
        
        System.out.print("Salario Mensual: ");
        double salario2 = entrada.nextDouble();

        Empleado emp2 = new Empleado(nombre2, apellido2, salario2);

        System.out.println(emp1.primerNombre + " " + emp1.apellidoPaterno + ": $" + emp1.salarioAnual());
        System.out.println(emp2.primerNombre + " " + emp2.apellidoPaterno + ": $" + emp2.salarioAnual());

        emp1.salarioMensual = emp1.salarioMensual * 1.10;
        emp2.salarioMensual = emp2.salarioMensual * 1.10;

        System.out.println(emp1.primerNombre + " " + emp1.apellidoPaterno + ": $" + emp1.salarioAnual());
        System.out.println(emp2.primerNombre + " " + emp2.apellidoPaterno + ": $" + emp2.salarioAnual());
    }
}