package mx.unam.fi.poo.proyecto2;
public class EmpleadoAsalariado extends Empleado {
    //atributos agregados
    private double salarioSemanal;
    //constructor con herencia
    public EmpleadoAsalariado(String nombre, String apellidoPaterno, String apellidoMaterno, int numsegurosocial,double salarioSemanal) {
        super(nombre, apellidoPaterno, apellidoMaterno, numsegurosocial);
        this.salarioSemanal = salarioSemanal;
    }
    //setter y getter
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal>0)
        {
            this.salarioSemanal = salarioSemanal;
        }
    }

    //metodos sobreescritos
    @Override
    public double ingresos()
    {
        return getSalarioSemanal();
    }

    @Override
    public String toString()
    {
        return "Empleado Asalariado";
    }
}