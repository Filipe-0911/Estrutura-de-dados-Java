import java.util.ArrayList;

public class ImplArrayListPessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>(10);

        lista.add(new Pessoa("Filipe", 30));
        lista.add(new Pessoa("Ianca", 27));
        lista.add(new Pessoa("Joaquim", 8));

        for (Pessoa pessoa  : lista) {
            System.out.println(pessoa);
            
        }
    }    
}
