import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class ImplPriorityList {
    public static void main(String[] args) {
        // Fila comum
        Queue<String> filaComum = new LinkedList<String>();

        filaComum.add("João");
        filaComum.add("Maria");
        filaComum.add("Pedro");

        System.out.println("Fila comum: ");
        while(!filaComum.isEmpty())  {
            System.out.println(filaComum.poll());
        }

        PriorityQueue<PessoaPrioridade> filaPrioridade = new PriorityQueue<PessoaPrioridade>();

        filaPrioridade.add(new PessoaPrioridade("Filipe", false));
        filaPrioridade.add(new PessoaPrioridade("Ianca", true));
        filaPrioridade.add(new PessoaPrioridade("Joaquim", false));
        filaPrioridade.add(new PessoaPrioridade("Olavo", false));
        filaPrioridade.add(new PessoaPrioridade("Olívia", true));

        System.out.println("\nFila de prioridade..");
        while(!filaPrioridade.isEmpty()) {
            System.out.println(filaPrioridade.poll());
        }




    }
} 