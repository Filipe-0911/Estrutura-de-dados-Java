import java.util.Scanner;

public class ImplFibonacciIterativo {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número que deseja saber o fibonacci: ");
        int numero = in.nextInt();
        int resultado = fib(numero);
        in.close();

        System.out.println("O fibonacci de %d é %d.".formatted(numero, resultado));

    }

    public static int fib (int n) {
        int i = 1;
        int j = 0;
        int t;
        for (int k = 1; k <= n; k++) {
            t = i + j;
            i = j;
            j = t;
        }
        return j;
    }
}
