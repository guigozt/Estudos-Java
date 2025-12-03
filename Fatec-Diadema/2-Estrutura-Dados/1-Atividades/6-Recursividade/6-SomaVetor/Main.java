public class Main {
    public static int somaVetor(int[] vetor, int indice) {
        if (indice == vetor.length) {
            return 0; // caso base: fim do vetor
        }
        return vetor[indice] + somaVetor(vetor, indice + 1);
    }
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8};
        System.out.println("Soma: " + somaVetor(numeros, 0));
    }
}
