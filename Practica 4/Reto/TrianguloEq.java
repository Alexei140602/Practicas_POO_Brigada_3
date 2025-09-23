public class TrianguloEq {
    public static void main(String[] args) {
        Punto a=new Punto(Double.parseDouble(args[0]),Double.parseDouble(args[1])); 
        Punto b=new Punto(Double.parseDouble(args[2]),Double.parseDouble(args[3]));
        Punto c=new Punto(Double.parseDouble(args[4]),Double.parseDouble(args[5]));
        Calculo controlador = new Calculo();
        Ventana ventana = new Ventana(controlador, a,b,c);
        ventana.setVisible(true);
    }
}