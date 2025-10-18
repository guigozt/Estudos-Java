import java.util.Scanner;

public class SomaMatriz {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[][] mat1 = new int[2][2];
            int[][] mat2 = new int[2][2];
            int[][] soma = new int[2][2];

            // Ler matriz 1
            for (int linha = 0; linha < 2; linha++) {
                for (int coluna = 0; coluna < 2; coluna++) {
                    System.out.printf("Valor para Matriz 1: linha[%d] coluna[%d]: ", linha, coluna);
                    mat1[linha][coluna] = entrada.nextInt();
                }
            }

            System.out.println("\n-------------------------\n");

            // Ler matriz 2
            for (int linha = 0; linha < 2; linha++) {
                for (int coluna = 0; coluna < 2; coluna++) {
                    System.out.printf("Valor para Matriz 2: linha[%d] coluna[%d]: ", linha, coluna);
                    mat2[linha][coluna] = entrada.nextInt();
                }
            }

            // Somar matrizes
            for (int linha = 0; linha < 2; linha++) {
                for (int coluna = 0; coluna < 2; coluna++) {
                    soma[linha][coluna] = mat1[linha][coluna] + mat2[linha][coluna];
                }
            }

            // Exibir matriz soma
            System.out.println("\nSoma das Matrizes:");
            for (int linha = 0; linha < 2; linha++) {
                for (int coluna = 0; coluna < 2; coluna++) {
                    System.out.print(soma[linha][coluna] + " ");
                }
                System.out.println();
            }
        }
    }
}
