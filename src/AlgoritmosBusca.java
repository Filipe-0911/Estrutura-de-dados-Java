public class AlgoritmosBusca {
    public static void main(String[] args) {
        int[] lista = {64, 34, 25, 12, 22, 11, 90};
        int valorProcurado = 22;
        
        int resultado = BinarySearch(AlgoritmosOrdenacao.bubbleSortCrescente(lista), valorProcurado);
        AlgoritmosOrdenacao.imprimirLista(lista);

        if (resultado == -1) {
            System.out.println("Item não encontrado");
        } else {
            System.out.println("Item %d encontrado na posição %d.".formatted(valorProcurado, resultado));
        }
    }

    public static int buscaSequencial(int[] lista, int valorProcurado) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == valorProcurado) {
                return i;
            }
        }
        return -1;
    }

    public static int buscaSequencialListaOrdenada(int[] lista, int valorProcurado) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
            if (lista[i] == valorProcurado)  {
                return i;
            } else if (lista[i] > valorProcurado) {
                return -1;
            }
            
        }
        return -1;
    }

    public static int BinarySearch(int[] lista, int valorProcurado) {
        int esquerda = 0;
        int direita = lista.length -1;
        
        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;
            System.out.println(lista[meio]);
            if (lista[meio] == valorProcurado) {
                return meio;
            } else if(lista[meio] < valorProcurado) {
                esquerda = meio + 1;

            } else {
                direita = meio - 1;
            }
        }

        return -1;
    }
}
