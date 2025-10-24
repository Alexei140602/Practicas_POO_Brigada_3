package mx.unam.fi.poo.proyecto2;
public class MainApp {
    public static void main (String[] args)
    {
        int valorEntero = (int) (Math.floor(Math.random()*2));
        Empleado godin;
        if(valorEntero==0)
        {
            godin= new EmpleadoAsalariado("Edgar","Ruiz", "Miguel", 123456,20000.0);
            System.out.println("-----Empleado consultado-----");
            System.out.println(godin.getNombre());
            System.out.println(godin.getApellidoPaterno());
            System.out.println(godin.getApellidoMaterno());
            System.out.println(godin.getNumsegurosocial());
            System.out.println("es un "+ godin.toString());
            System.out.println(godin.ingresos());
        }
        else if (valorEntero==1)
        {
            godin= new EmpleadoPorComisión("Alexei","Ramírez","Pedroza",456789, 420, .5);
            System.out.println("-----Empleado consultado-----");
            System.out.println(godin.getNombre());
            System.out.println(godin.getApellidoPaterno());
            System.out.println(godin.getApellidoMaterno());
            System.out.println(godin.getNumsegurosocial());
            System.out.println("es un "+ godin.toString());
            System.out.println(godin.ingresos());
        }
       



    }
}
