public class Main {
    public static boolean ehPalindromo(String texto, int inicio, int fim) {
    if (inicio >= fim) {
        return true; // caso base
    }
    if (texto.charAt(inicio) != texto.charAt(fim)) {
        return false;
    }
    return ehPalindromo(texto, inicio + 1, fim - 1);
}

public static void main(String[] args) {
    System.out.println(ehPalindromo("arara", 0, 4)); // true
    System.out.println(ehPalindromo("fatec", 0, 4)); // false
}

}
