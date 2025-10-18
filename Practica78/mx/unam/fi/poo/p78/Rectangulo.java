package mx.unam.fi.poo.p78;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class Rectangulo extends Figura{
    private double Alto;
    private double Ancho;

    public Rectangulo(double p1, double p2)
    {
        this.Ancho=p1;
        this.Alto=p2;
    }
    public double getAlto() {
        return Alto;
    }

    public void setAlto(double alto) {
        Alto = alto;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double ancho) {
        Ancho = ancho;
    }

    @Override 
    public double area()
    {
        return Alto*Ancho;
    }

    @Override 
    public double perimetro()
    {
        return 2*Alto+2*Ancho;
    }
    

    @Override
    public void dibujar(Graphics2D g, Dimension size) {
        double margen = 20;
        double maxW = size.width - 2 * margen;
        double maxH = size.height - 2 * margen;

        double escalaW = maxW / Math.max(getAncho(), 1.0);
        double escalaH = maxH / Math.max(getAlto(), 1.0);
        double escala = Math.min(escalaW, escalaH);

        int w = (int) Math.round(getAncho() * escala);
        int h = (int) Math.round(getAlto() * escala);
        int x = (size.width - w) / 2;
        int y = (size.height - h) / 2;

        g.drawRect(x, y, w, h);
    }
}