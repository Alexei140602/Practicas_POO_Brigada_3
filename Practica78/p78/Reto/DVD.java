public class DVD extends Material {
    private int duracion;

    public DVD(String titulo, String autor, int anio, int duracion) {
        super(titulo, autor, anio);
        this.duracion = duracion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("DVD:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
        System.out.println("Duración: " + duracion + " minutos");
    }
}
