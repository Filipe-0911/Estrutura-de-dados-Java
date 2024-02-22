import java.util.ArrayList;
import java.util.Iterator;

public class ImplArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>(10);

        lista.add("Filipe");
        lista.add("Ianca");
        lista.add("Joaquim");
        lista.add("Olavo");
        lista.add("Olívia");
        lista.add("Jacqueline");
        lista.add("Fernanda");
        lista.add("Lemoel");
        lista.add("Suzy");
        lista.add("Branca");

        Iterator <String> it = lista.iterator();

        while (it.hasNext())  {
            String aux = (String) it.next();
            System.out.println(aux);
        }
    }

}