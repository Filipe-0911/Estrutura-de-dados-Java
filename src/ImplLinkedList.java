import java.util.LinkedList;
// import java.util.Iterator;

public class ImplLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();

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

        // Iterator<String> it = lista.iterator();
        
        // while (it.hasNext())  {
        //     String aux = (String) it.next();
        //     System.out.println(aux);
        // }

        System.out.println("A lista tem tamanho " + lista.size());
        System.out.println("Este é o elemento 5: " + lista.get(5));
        int length = lista.size();
        System.out.println(lista);
        // PEPS

        for (int i = 0; i < length; i++) {
            System.out.println(lista.getFirst());
            lista.removeFirst();

        }

        System.out.println(lista);
    
    }

}