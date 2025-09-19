import java.util.ArrayList;
import java.util.Scanner;
public class Proyecto
{
   public static void main(String[] args) {
       
    ArrayList <Carrito> listaCarritos = new ArrayList<>();
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
            System.out.println("1.Agregar carrito");
            System.out.println("2.Eliminar carrito");
            System.out.println("3.Mostrar carrito");
            System.out.println("4.SALIR");
            System.out.println("");
            System.out.println("INTRODUCE LA OPCIÓN");
            opcion= esc.nextInt();
            switch (opcion) 
            {
                case 1 -> {
                    System.out.println("ingresa el nombre del articulo");
                    String articuloNuevo= esc.next();
                    System.out.println("ingresa el precio del articulo");
                    double precioNuevo= esc.nextDouble();
                    Carrito carritoNuevo= new Carrito(articuloNuevo, precioNuevo);
                    listaCarritos.add(carritoNuevo);
            }
                case 2 -> {
                    System.out.println("Ingresa el articulo que quieres eliminar");
                    int numeroEliminar= esc.nextInt();
                    if (numeroEliminar>=1 && listaCarritos.size()>=numeroEliminar-1)
                    {
                        listaCarritos.remove(numeroEliminar-1);
                        System.out.println("Se ha eliminado el articulo numero"+ numeroEliminar);
                    }
            }
                case 3 -> {
                    if(listaCarritos.size()>0)
                    {
                        System.out.println("lista de articulos: \n");
                        for(int i=0; i<listaCarritos.size();i++)
                        {
                            System.out.println("articulo "+(i+1)+": "+listaCarritos.get(i).articulo+ " precio: "+listaCarritos.get(i).precio);
                        }
                    }
                    else
                    {
                        System.out.println("lista vacia :(");
                    }
            }
                case 4 -> {
                    esc.close();
                    System.out.println("bye bye");
            }
                default -> System.err.println("ERROR, NÚMERO NO VALIDO");
            }
        }while (opcion!=4);
    }
}

