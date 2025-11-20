public class Main {
    public static int potencia(int a, int b) {
    if (b == 0) {
        return 1; // caso base
    }
    return a * potencia(a, b - 1);
}

public static void main(String[] args) {
    System.out.println("2^5 = " + potencia(2, 5));
}

}
