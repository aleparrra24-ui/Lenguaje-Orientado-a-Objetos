//ANA ALEJANDRA PARRA
//ING. TI.
//0595316
//FECHA c#
using System;

class Fecha 
{
    public int mes;
    public int dia;
    public int anio;

    public Fecha(int m, int d, int a) 
    {
        mes = m;
        dia = d;
        anio = a;
    }

    public void MostrarFecha() 
    {
        Console.WriteLine(mes + "/" + dia + "/" + anio);
    }
}

class FechaTest 
{
    static void Main() 
    {
        
        Fecha miFecha = new Fecha(8, 30, 2026);

        Console.Write("La fecha es: ");
        miFecha.MostrarFecha();
    }
}