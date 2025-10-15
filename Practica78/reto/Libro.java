public class Libro extends Material {
    private int numeroPaginas;

    public Libro(String titulo, String autor, int anio, int numeroPaginas) {
        super(titulo, autor, anio);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}

