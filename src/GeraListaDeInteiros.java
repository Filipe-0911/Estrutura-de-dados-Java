import java.util.Random;

public class GeraListaDeInteiros {

    public static void main(String[] args) {
        int [] lista = geraLista();
        
        AlgoritmosOrdenacao.imprimirLista(lista);
    }

    public static int[] geraLista() {
        
        int tamanho = 1000;
        
        Random random = new Random();
        
        
        int[] lista = new int[tamanho];
        
        
        for (int i = 0; i < tamanho; i++) {
            lista[i] = random.nextInt(1000); 
        }
        
        
        return lista;
    }
}
