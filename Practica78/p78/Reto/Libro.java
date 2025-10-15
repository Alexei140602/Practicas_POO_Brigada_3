public class Libro extends Material {
    private int paginas;

    public Libro(String titulo, String autor, int anio, int paginas) {
        super(titulo, autor, anio);
        this.paginas = paginas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
        System.out.println("Paginas: " + paginas);
    }
}
