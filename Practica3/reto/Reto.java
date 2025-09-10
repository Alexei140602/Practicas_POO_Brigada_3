
import java.util.ArrayList;

public class Reto
{
    public static void EcuacionCuadratica(double a, double b, double c)
    {
        System.out.println("\nEcuación: " + a + "x² + " + b + "x + " + c + " = 0");
        
        // Caso especial: a = 0 (ecuación lineal)
        if (a == 0)
        {
            if (b == 0) 
            {
                if (c == 0) 
                {
                    System.out.println("La ecuación tiene infinitas soluciones");
                } 
                else
                {
                    System.out.println("La ecuación no tiene solución");
                }
            } 
            else
            {
                double x = -c / b;
                System.out.println("Es una ecuación lineal");
                System.out.println("Solución: x = " + x);
            }
            return;
        }
        double discriminante=   b*b-4*a*c;
        if (discriminante>0) 
        {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } 
        else if (discriminante == 0) 
        {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } 
        else 
        {
            double real = -b / (2 * a);
            double imaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("x1 = " + real + " + " + imaginaria + "i");
            System.out.println("x2 = " + real + " - " + imaginaria + "i");
        }
    }
    public static void main(String[] args) 
    {
        ArrayList<Double> arreglobonito= new ArrayList<>();
         for (String a : args) 
        {
            double numero = Double.parseDouble(a);
            arreglobonito.add(numero);
        }
        if (arreglobonito.size()>3) {
            System.err.println("Favor de agregar un número correcto de variables");
        }
        else
        {
            EcuacionCuadratica(arreglobonito.get(0), arreglobonito.get(1), arreglobonito.get(2));
        }
    }
}