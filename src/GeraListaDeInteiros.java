import java.util.Random;

public class GeraListaDeInteiros {

    public static void main(String[] args) {
        int [] lista = geraLista();
        
        AlgoritmosOrdenacao.imprimirLista(lista);
    }

    public static int[] geraLista() {
        int num = 50000;
        
        int tamanho = num;
        
        Random random = new Random();
        
        
        int[] lista = new int[tamanho];
        
        
        for (int i = 0; i < tamanho; i++) {
            lista[i] = random.nextInt(num); 
        }
        
        
        return lista;
    }

    public static int[] geraListaOrdenada() {
        int num = 50000;
        
        int tamanho = num;
        
        Random random = new Random();
        
        
        int[] lista = new int[tamanho];
        
        
        for (int i = 0; i < tamanho; i++) {
            lista[i] = random.nextInt(num); 
        }
        
        
        return AlgoritmosOrdenacao.bubbleSortCrescente(lista);
    }
}
