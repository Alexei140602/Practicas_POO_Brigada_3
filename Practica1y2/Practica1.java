import java.util.Scanner;
public class Practica1 
{
    static long factorial (int n)
    {
        if (n==0|| n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1); 
        }
    }
    static long fibonacci (int n)
    {
        if (n==0)
        {
            return 0;
        }
        else if (n==1)
        {
            return 1;
        }
        else 
        {
            return fibonacci(n-1)+ fibonacci(n-2);    
        }
    }
    static long collatz(int n)
    {
        while (n!=1) 
        {
            if (n%2==0) 
            {
                n= n/2;
            }
            else
            {
                n= 3*n+1;
            }
            System.err.print( n + " ");    
        }
        return n;
    }
    public static void main(String[] args) 
    {
        int opcion;
        Scanner esc= new Scanner(System.in);
        do
        {
            System.out.println();
            System.out.println();
            System.out.println("MENU");
            System.out.println("");
            System.out.println("-----------------------------------------");
            System.out.println("");
            System.out.println("1.FACTORIAL DE UN NÚMERO");
            System.out.println("2.CALCULAR LA SERIE DE FIBONACCI");
            System.out.println("3.CONJETURA DE COLLATZ");
            System.out.println("4.SALIR");
            System.out.println("");
            System.out.println("INTRODUCE LA OPCIÓN");
            opcion= esc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("INGRESA EL FACTORIAL QUE QUIERES CALCULAR");
                    int num= esc.nextInt();
                    System.out.println("El factorial de dicho numero es "+factorial(num)+"\n"); 
                    break;
            
                case 2:
                    System.out.println("INGRESA EL NUMERO DE LA SERIE FIBONACCI QUE QUIERES CALCULAR");
                    int NUM_FIB= esc.nextInt();
                    System.out.println("El número de la serie es :"); 
                    for(int i=0; i<NUM_FIB; i++)
                    {
                        System.out.print(fibonacci(i)+",");
                    }
                    break;
                case 3:
                    System.out.println("INGRESA EL NUMERO DE LA SERIE DE COLLATZ QUE QUIERES CALCULAR");
                    int num_coll= esc.nextInt();
                    collatz(num_coll);
                break;
                case 4:
                    esc.close();
                    System.out.println("bye bye");
                    break;
                default:
                    System.err.println("ERROR, NÚMERO NO VALIDO");
                
                    break;
            }
        }while (opcion!=4);
    }
    
}