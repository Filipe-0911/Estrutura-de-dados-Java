import java.util.Scanner;

public class ImplFatorialIterativo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número que deseja saber o fatorial: ");
        int numero = in.nextInt();
        int resultado = fatorial(numero);
        in.close();

        System.out.println("O fatorial de %d é %d.".formatted(numero, resultado));

    }

    public static int fatorial (int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
