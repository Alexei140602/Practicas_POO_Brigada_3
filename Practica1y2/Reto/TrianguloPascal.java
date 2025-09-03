//POO PRACTICA 1 Y 2
//EQUIPO 03
//RETO: Crear un programa que imprima el triangulo de pascal 
import java.util.Scanner;
    public class TrianguloPascal {
        //Función recursiva
        static int coeficientes(int n, int m) {
            if (n == 0 || n == 1 || m==0 || m==n) { //casos base
                return 1;
            }
            return coeficientes(n - 1, m - 1) + coeficientes(n - 1, m);// generar los valores de cada fila
        }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nivel de los coeficientes del triangulo de pascal:");
        int nivel = sc.nextInt();

                for (int i = 0; i < nivel; i++) { //imprimira la n cantidad de niveles que propocione el usuario
            
            for (int k = 0; k < nivel - i - 1; k++) { // imprime espacios para formar el triangulo
                System.out.print("  ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", coeficientes(i, j)); // imprime los valores de cada fila llamando a la funcion coeficientes
            }
            System.out.println();

    }
}
}