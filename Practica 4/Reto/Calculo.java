import java.lang.Math;

public class Calculo
{
    double a,b,c;

    public String distancia(Punto a, Punto b, Punto c) 
    {
        double distanciaAB, distanciaAC, distanciaBC;   
        double d1,d2,d3;
        double diffXAB = b.x - a.x;
        double diffYAB = b.y - a.y;
        double diffXAC = c.x - a.x;
        double diffYAC = c.y - a.y;
        double diffXBC = c.x - b.x;
        double diffYBC = c.y - b.y;

        
        distanciaAB = Math.round(Math.sqrt(Math.pow(diffXAB, 2) + Math.pow(diffYAB, 2)) * 10) / 10.0;
        distanciaAC = Math.round(Math.sqrt(Math.pow(diffXAC, 2) + Math.pow(diffYAC, 2)) * 10) / 10.0;
        distanciaBC = Math.round(Math.sqrt(Math.pow(diffXBC, 2) + Math.pow(diffYBC, 2)) * 10) / 10.0;

        d1 = Math.abs(distanciaAB - distanciaAC);
        d2 = Math.abs(distanciaAB - distanciaBC);
        d3 = Math.abs(distanciaAC - distanciaBC);

        
        if ((a.x==b.x && a.y==b.y) || (a.x==c.x && a.y==c.y) || (b.x==c.x && b.y==c.y))
        {
            return "Ingresaste el mismo punto";
        }
        else
        {
            if (d1 < 0.1 && d2 < 0.1 && d3 < 0.1)
            {
                return "Los puntos forman un triangulo equilatero y la distancia entre los puntos es: " + distanciaAB;
            }
            else
            {
                return "Los puntos no forman un triangulo equilatero";
            }
        }
    }
}
