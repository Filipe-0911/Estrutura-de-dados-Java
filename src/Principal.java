import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Scanner in = new Scanner(System.in);

        fila.inserir("Filipe");
        fila.inserir("Ianca");
        fila.inserir("Joaquim");
        fila.inserir("Olavo");
        fila.inserir("Olivia");

        while (true) {
            System.out.println("Escolha uma opção");
            System.out.println("I - Inserir");
            System.out.println("A - Atender");
            System.out.println("L - listar fila");
            System.out.println("Para sair digite qualquer Letra");
            String op = in.nextLine();
            op = op.toLowerCase();
            
            if (op.equals("i")) {
                System.out.println("Digite o nome da pessoa: ");
                String nome = in.nextLine();
                fila.inserir(nome);
                System.out.println("");
            } else if(op.equals("a")) {
                System.out.println("O Próximo elemento da fila é " + fila.atender());
                System.out.println("");
            } else if(op.equals("l")) {
                fila.listar();
                System.out.println("");
            }  else {
                in.close();
                break;
            }
        }
    }
}
