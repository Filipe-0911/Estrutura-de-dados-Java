import java.util.LinkedList;

public class ImplPilha {
    public static void main(String[] args) {
        LinkedList<String> pilha = new LinkedList<String>();

        pilha.push("Filipe");
        pilha.push("Ianca");
        pilha.push("Joaquim");
        pilha.push("Olavo");
        pilha.push("Olívia");

        int tam = pilha.size();

        for (int i = 0; i < tam; i++) {
            System.out.println(pilha.pop());
        }
    }
}
