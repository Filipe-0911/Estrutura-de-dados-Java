import java.util.Scanner;

public class ImplFatorialRecursivo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número que deseja saber o fatorial: ");
        int numero = in.nextInt();
        int resultado = fatorial(numero);
        in.close();

        System.out.println("O fatorial de %d é %d.".formatted(numero, resultado));

    }

    public static int fatorial (int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n-1);
        }
    }
}
