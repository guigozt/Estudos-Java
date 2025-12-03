public class Main {

    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        int valor = 5;
        System.out.printf("Fatorial [%d] = %d", valor, fatorial(5));
    }
}