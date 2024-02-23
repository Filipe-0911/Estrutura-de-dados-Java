public class AlgoritmosBusca {
    public static void main(String[] args) {
        // int[] lista = {64, 34, 25, 12, 22, 11, 90};
        int [] lista = GeraListaDeInteiros.geraLista();
        int valorProcurado = lista[30];
        AlgoritmosOrdenacao.bubbleSortCrescente(lista);
        
        int resultadoSequencial = buscaSequencial(lista, valorProcurado);
        int resultadoSequencialOrdenado = buscaSequencialListaOrdenada(lista, valorProcurado);
        int resultadoBinarySearch = binarySearch(lista, valorProcurado);
        
        System.out.println();
        System.out.println("Item %d encontrado na posição %d.".formatted(valorProcurado, resultadoSequencial));
        System.out.println("Item %d encontrado na posição %d.".formatted(valorProcurado, resultadoSequencialOrdenado));
        System.out.println("Item %d encontrado na posição %d.".formatted(valorProcurado, resultadoBinarySearch));

        // if (resultado == -1) {
        //     System.out.println("Item não encontrado");
        // } else {
        //     System.out.println("Item %d encontrado na posição %d.".formatted(valorProcurado, resultado));
        // }
    }

    public static int buscaSequencial(int[] lista, int valorProcurado) {
        int passos = 0;
        for (int i = 0; i < lista.length; i++) {
            
            if (lista[i] == valorProcurado) {
                System.out.println("%d Passos da busca Sequencial".formatted(passos));
                return i;
            }
            passos++;
        }

        return -1;
    }

    public static int buscaSequencialListaOrdenada(int[] lista, int valorProcurado) {
        int passos = 0;
        for (int i = 0; i < lista.length; i++) {
            
            if (lista[i] == valorProcurado)  {
                System.out.println("%d Passos da busca Sequencial ordenada".formatted(passos));
                return i;
            } else if (lista[i] > valorProcurado) {
                return -1;
            }
            passos++;
            
        }
        return -1;
    }

    public static int binarySearch(int[] lista, int valorProcurado) {
        int esquerda = 0;
        int direita = lista.length -1;
        int passos = 0;
        
        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;
            
            passos++;
            if (lista[meio] == valorProcurado) {
                System.out.println("%d Passos da busca binary search".formatted(passos));
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
