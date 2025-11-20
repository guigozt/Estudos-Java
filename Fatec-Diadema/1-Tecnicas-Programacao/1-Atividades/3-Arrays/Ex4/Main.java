import java.util.Scanner;

public class Main {

    // Método para calcular o fatorial de um número
    public static int calcularFatorial(int num) {
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[] A = new int[5];

            // Lendo valores do usuário para o vetor A
            for (int i = 0; i < A.length; i++) {
                System.out.printf("Digite um número para posição [%d]: ", i + 1);
                A[i] = entrada.nextInt();
            }

            int[] B = new int[5];

            // Calculando o fatorial de cada elemento de A e armazenando em B
            for (int i = 0; i < B.length; i++) {
                B[i] = calcularFatorial(A[i]);
            }

            // Mostrando os dois vetores
            System.out.println("\nVetor A (números digitados):");
            for (int i = 0; i < A.length; i++) {
                System.out.printf("A[%d] = %d\n", i, A[i]);
            }

            System.out.println("\nVetor B (fatorial dos elementos de A):");
            for (int i = 0; i < B.length; i++) {
                System.out.printf("B[%d] = %d\n", i, B[i]);
            }
        }
    }
}
