package mx.unam.fi.poo.proyecto2;
public class EmpleadoPorComisión extends Empleado {
    //atributos
    private double ventasNetas;
    private double tarifaDecomision;

    //setters y getters
    public double getVentasNetas() {
        return ventasNetas;
    }

    public void setVentasNetas(double ventasNetas) {
        if (ventasNetas>=0) 
        {
            this.ventasNetas = ventasNetas;    
        }
        else
        {
            System.out.println("Dato invalido, ventas netas no puede ser negativo");
        }
    }

    public double getTarifaDecomision() {
        return tarifaDecomision;
    }

    public void setTarifaDecomision(double tarifaDecomision) {
        if (tarifaDecomision>=0.0 && tarifaDecomision<=1.0) 
        {
             this.tarifaDecomision = tarifaDecomision;
        }
        else
        {
            System.out.println("Tarifa de comisión invalida");
        }
    }

    //constructor con herencia
    public EmpleadoPorComisión(String nombre, String apellidoPaterno, String apellidoMaterno, int numsegurosocial,
            double ventasNetas, double tarifaDecomision) {
        super(nombre, apellidoPaterno, apellidoMaterno, numsegurosocial);
        this.ventasNetas = ventasNetas;
        this.tarifaDecomision = tarifaDecomision;
    }

    //sobreescritura de metodos
    @Override
    public double ingresos()
    {
        return getTarifaDecomision()*getVentasNetas();
    }

    @Override
    public String toString()
    {
        return "Empleado por comisión";
    }
    

    
}
