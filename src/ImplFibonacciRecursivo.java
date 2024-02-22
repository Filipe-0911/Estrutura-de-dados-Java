import java.util.Scanner;

public class ImplFibonacciRecursivo {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número que deseja saber o fibonacci: ");
        int numero = in.nextInt();
        int resultado = fib(numero);
        in.close();

        System.out.println("O fibonacci de %d é %d.".formatted(numero, resultado));

    }

    public static int fib (int n) {
        if ( n == 1 || n == 2 ) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }
}
