public class Revista extends Material {
    private int edicion;

    public Revista(String titulo, String autor, int anio, int edicion) {
        super(titulo, autor, anio);
        this.edicion = edicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
        System.out.println("Edición: " + edicion);
    }
}
