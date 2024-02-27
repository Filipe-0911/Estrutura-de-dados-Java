public class Principal {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.inserir("Filipe");
        fila.inserir("Ianca");
        fila.inserir("Joaquim");
        fila.inserir("Olavo");
        fila.inserir("Olivia");

        fila.listar();
        
        System.out.println("Elemento atendido: " + fila.atender());
        System.out.println("Pessoas na fila: ");
        fila.listar();
    }
}
