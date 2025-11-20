import java.util.Scanner;

public class BubbleSortExemplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];

        // Ler os 10 elementos
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entrada.nextInt();
        }

        // Algoritmo Bubble Sort
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // troca
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        // Exibir vetor ordenado
        System.out.println("\nVetor ordenado em ordem crescente:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
