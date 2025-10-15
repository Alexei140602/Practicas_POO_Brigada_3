public class Revista extends Material {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int anio, int numeroEdicion) {
        super(titulo, autor, anio);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("📰 Revista:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
        System.out.println("Número de edición: " + numeroEdicion);
    }
}
