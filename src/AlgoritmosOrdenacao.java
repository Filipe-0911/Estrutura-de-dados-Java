public class AlgoritmosOrdenacao {
    public static void main(String[] args) {
        int[] lista = {64, 34, 25, 12, 22, 11, 90};
        // int [] lista = GeraListaDeInteiros.geraLista();
        System.out.println("Lista antes da ordenação.");
        imprimirLista(lista);
        selectionSortCrescente(lista);
        System.out.println("\nLista depois da ordenação crescente.");
        imprimirLista(lista);

    }
    public static int[] bubbleSortCrescente(int lista []) {
        int tmp;
        boolean trocou;
        int tamanhoLista = lista.length;

        for (int i = 0; i < tamanhoLista; i++) {
            trocou = false;
            for (int j = 0; j < tamanhoLista - 1; j++) {
                if(lista[j] > lista[j + 1]) {
                    tmp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = tmp;
                    trocou = true;
                }
            }
            if(!trocou) {
                break;
            }
        }
        return lista;
    }
    
    public static int[] bubbleSortDecrescente (int lista []) {
        int tmp;
        boolean trocou;
        for (int i = 0; i < lista.length; i++) {
            trocou = false;
            for (int j = 0; j < lista.length - 1; j++) {
                if(lista[j] < lista[j + 1]) {
                    tmp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = tmp;
                    trocou = true;
                }
            }
            if(!trocou) {
                break;
            }
        }
        return lista;
    }

    public static int[] selectionSortCrescente (int [] lista) {
        int n = lista.length;
        // Loop externo que percorre a lista
        for (int i = 0; i < n - 1; i++) {
            // Assumindo que o elemento atual é o menor
            int minIndex = i;
            // Loop interno que compara elemento atual com demais elementos
            for (int j = i + 1; j < n; j++) {
                // Se encontrarmos um elemento menor que o atual atualizamos o indice minimo (minIndex)
                if(lista[j] < lista[minIndex])  {
                    minIndex = j;
                }
            }

            // Após encontrarmos o elemento menor, trocamos sua posição com o elemento atual
            int temp = lista[minIndex];
            lista[minIndex] = lista[i];
            lista[i] = temp;
        }

        return lista;
    }
    
    public static int[] selectionSortDecrescente (int [] lista) {
        int n = lista.length;
        // Loop externo que percorre a lista
        for (int i = 0; i < n - 1; i++) {
            // Assumindo que o elemento atual é o menor
            int minIndex = i;
            // Loop interno que compara elemento atual com demais elementos
            for (int j = i + 1; j < n; j++) {
                // Se encontrarmos um elemento menor que o atual atualizamos o indice minimo (minIndex)
                if(lista[j] > lista[minIndex])  {
                    minIndex = j;
                }
            }

            // Após encontrarmos o elemento menor, trocamos sua posição com o elemento atual
            int temp = lista[minIndex];
            lista[minIndex] = lista[i];
            lista[i] = temp;
        }

        return lista;
    }

    public static int[] inserctionSortCrescente(int [] lista) {
        int i, j, chave;
        for (i = 1; i < lista.length; i++) {
            chave = lista[i];
            for (j = i - 1; (j >= 0) && (lista[j] > chave); j--) {
                lista[j + 1] = lista[j];
            }
            lista[j+1] = chave;
        }       
        return lista;
    }

    public static int[] inserctionSortDecrescente(int [] lista) {
        int i, j, chave;
        for (i = 1; i < lista.length; i++) {
            chave = lista[i];
            for (j = i - 1; (j >= 0) && (lista[j] < chave); j--) {
                lista[j + 1] = lista[j];
            }
            lista[j+1] = chave;
        }       
        return lista;
    }
  
    public static void imprimirLista(int [] lista) {
        for (int i = 0; i < lista.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(lista[i]);
        }
        System.out.println();
    }
}
