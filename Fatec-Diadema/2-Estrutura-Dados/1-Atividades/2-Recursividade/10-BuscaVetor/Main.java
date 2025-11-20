public class Main {
    public static boolean busca(int[] vetor, int valor, int indice) {
    if (indice == vetor.length) {
        return false; // caso base: fim do vetor
    }
    if (vetor[indice] == valor) {
        return true; // achou
    }
    return busca(vetor, valor, indice + 1);
}

public static void main(String[] args) {
    int[] vetor = {1, 3, 5, 7, 9};
    System.out.println(busca(vetor, 5, 0)); // true
    System.out.println(busca(vetor, 2, 0)); // false
}

}
