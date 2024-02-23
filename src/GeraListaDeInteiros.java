import java.util.Random;

public class GeraListaDeInteiros {

    public static void main(String[] args) {
        int [] lista = geraLista();
        
        AlgoritmosOrdenacao.imprimirLista(lista);
    }

    public static int[] geraLista() {
        // Tamanho da lista
        int tamanho = 1000;
        
        // Criando um objeto Random para gerar números aleatórios
        Random random = new Random();
        
        // Array para armazenar os números
        int[] lista = new int[tamanho];
        
        // Preenchendo o array com números aleatórios
        for (int i = 0; i < tamanho; i++) {
            lista[i] = random.nextInt(1000); // Gera números aleatórios entre 0 e 9999
        }
        
        // Exibindo a lista
        System.out.println("Lista gerada:");
        return lista;
    }
}
