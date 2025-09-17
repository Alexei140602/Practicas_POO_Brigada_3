import  java.lang.Math;
public class Calculo {
    double a,b;
    public String distancia(Punto a, Punto b) {
        double distancia;   
        double diffX = b.x - a.x;
        double diffY = b.y - a.y;
        distancia=Math.sqrt(Math.pow((diffX), 2) + Math.pow(diffY, 2));
        return "La distancia entre el punto {"+a.x+","+a.y+"} y el punto {"+ b.x+","+b.y+"} es de :"+distancia;
    }
}
