public class Practica4 {
    public static void main(String[] args) {
        Punto a=new Punto(Integer.parseInt(args[0]),Integer.parseInt(args[1])); 
        Punto b=new Punto(Integer.parseInt(args[2]),Integer.parseInt(args[3]));
        Calculo controlador = new Calculo();
        Ventana ventana = new Ventana(controlador, a,b);
        ventana.setVisible(true);
    }
}