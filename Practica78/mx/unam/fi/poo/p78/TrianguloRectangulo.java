package mx.unam.fi.poo.p78;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class TrianguloRectangulo extends Figura {
    private double Altura;
    private double Base;

       public TrianguloRectangulo(double p1, double p2)
    {
        this.Base=p1;
        this.Altura=p2;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double base) {
        Base = base;
    }

    @Override 
    public double area()
    {
        return (Altura*Base)/2;
    }

    @Override 
    public double perimetro()
    {
        return Altura+Base+(Math.sqrt(Math.pow(Altura,2)+Math.pow(Base,2)));
    }

    @Override
    public void dibujar(Graphics2D g, Dimension size) {
        double margen = 20;
        double maxW = size.width - 2 * margen;
        double maxH = size.height - 2 * margen;

        double escalaW = maxW / Math.max(getBase(), 1.0);
        double escalaH = maxH / Math.max(getAltura(), 1.0);
        double escala = Math.min(escalaW, escalaH);

        int b = (int) Math.round(getBase() * escala);
        int h = (int) Math.round(getAltura() * escala);

        int x0 = (size.width - b) / 2;
        int y0 = (size.height + h) / 2;

        int x1 = x0 + b;
        int y1 = y0;
        int x2 = x0;
        int y2 = y0 - h;

        int[] xs = {x0, x1, x2};
        int[] ys = {y0, y1, y2};
        g.drawPolygon(xs, ys, 3);
    }
}