public class MainApp {
    public static void main(String[] args) {
        Material[] materiales = new Material[3];

        materiales[0] = new Libro("El Quijote", "Miguel de Cervantes", 1605, 863);
        materiales[1] = new Revista("National Geographic", "Varios autores", 2023, 151);
        materiales[2] = new DVD("Matrix", "Lana y Lilly Wachowski", 1999, 136);

        for (Material m : materiales) {
            m.mostrarInformacion();
            System.out.println("------------------------");
        }
    }
}
