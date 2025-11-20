public class Main {
    public static String decimalParaBinario(int n) {
    if (n == 0) {
        return "";
    }
    return decimalParaBinario(n / 2) + (n % 2);
}

public static void main(String[] args) {
    int numero = 13;
    System.out.println("Binário de " + numero + ": " + decimalParaBinario(numero));
}

}
