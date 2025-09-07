import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

public class Practica3
{
    public static String generaHash(String texto)
    {
        int semilla =0;
        for (char c : texto.toCharArray()) {
            semilla+=c;
        }
        Random random = new Random(semilla);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 32; i++) {
            int valor = random.nextInt(16);
            sb.append(Integer.toHexString(valor));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        ArrayList<String> arreglobonito= new ArrayList<>();
        for (String a : args) 
        {
            arreglobonito.add(a);
        }
        for (int i = 0; i < args.length; i++) {
            String hash= generaHash(arreglobonito.get(i));
          HashMap<String, String> Mapa = new HashMap<String, String>();
            Mapa.put(arreglobonito.get(i),hash);
            System.out.println(Mapa);  
         }
    }
}
