package mx.unam.fi.poo.proyecto2;
public abstract class Empleado {
    //atributos
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int numsegurosocial;

    //setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public int getNumsegurosocial() {
        return numsegurosocial;
    }
    public void setNumsegurosocial(int numsegurosocial) {
        this.numsegurosocial = numsegurosocial;
    }

    // constructor
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, int numsegurosocial) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numsegurosocial = numsegurosocial;
    }
    //metodos varios
    public abstract String toString();
    public abstract double ingresos();
}