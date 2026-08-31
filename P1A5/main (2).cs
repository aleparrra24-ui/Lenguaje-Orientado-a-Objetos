//ANA ALEJANDRA PARRA
//ING TI.
//00595316
//PROBLEMA 2 EMPLEADO C#
using System;

class Empleado 
{
    public string primerNombre;
    public string apellidoPaterno;
    public double salarioMensual;

    public Empleado(string nombre, string apellido, double salario) 
    {
        primerNombre = nombre;
        apellidoPaterno = apellido;

        if (salario > 0.0) 
        {
            salarioMensual = salario;
        } 
        else 
        {
            salarioMensual = 0.0;
        }
    }

    public double SalarioAnual() 
    {
        return salarioMensual * 12;
    }
}

class EmpleadoTest 
{
    static void Main(string[] args) 
    {
        Console.WriteLine("Nombre: ");
        string nombre1 = Console.ReadLine();
        
        Console.WriteLine("Apellido Paterno: ");
        string apellido1 = Console.ReadLine();
        
        Console.WriteLine("Salario Mensual: ");
        double salario1 = Convert.ToDouble(Console.ReadLine());

        Empleado emp1 = new Empleado(nombre1, apellido1, salario1);

        Console.WriteLine("Nombre: ");
        string nombre2 = Console.ReadLine();
        
        Console.WriteLine("Apellido Paterno: ");
        string apellido2 = Console.ReadLine();
        
        Console.WriteLine("Salario Mensual: ");
        double salario2 = Convert.ToDouble(Console.ReadLine());

        Empleado emp2 = new Empleado(nombre2, apellido2, salario2);

        Console.WriteLine(emp1.primerNombre + " " + emp1.apellidoPaterno + ": $" + emp1.SalarioAnual());
        Console.WriteLine(emp2.primerNombre + " " + emp2.apellidoPaterno + ": $" + emp2.SalarioAnual());

        emp1.salarioMensual = emp1.salarioMensual * 1.10;
        emp2.salarioMensual = emp2.salarioMensual * 1.10;

        Console.WriteLine(emp1.primerNombre + " " + emp1.apellidoPaterno + ": $" + emp1.SalarioAnual());
        Console.WriteLine(emp2.primerNombre + " " + emp2.apellidoPaterno + ": $" + emp2.SalarioAnual());
    }
}