import java.util.Scanner;

public class TranspostaMatriz {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int[][] matriz = new int[3][2];
            int[][] transposta = new int[2][3];

            // Ler a matriz 3x2
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.printf("Valor para linha[%d] coluna[%d]: ", i, j);
                    matriz[i][j] = entrada.nextInt();
                }
            }

            // Calcular transposta (troca linha <-> coluna)
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    transposta[j][i] = matriz[i][j];
                }
            }

            // Exibir matriz original
            System.out.println("\nMatriz Original:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            // Exibir transposta
            System.out.println("\nMatriz Transposta:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(transposta[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
