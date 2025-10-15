public class MainApp {
    public static void main(String[] args) {
        Material[] materiales = new Material[3];

        materiales[0] = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 1967,10000);
        materiales[1] = new Revista("National Geographic", "No se", 2025, 100);
        materiales[2] = new DVD("Avatar", "James Cameron", 2007, 136);

        for (Material m : materiales) {
            m.mostrarInformacion();
            System.out.println("-------------");
        }
    }
}
