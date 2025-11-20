public class MultMatriz {
    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 2},
            {3, 4}
        };

        int[][] mat2 = {
            {5, 6},
            {7, 8}
        };

        int[][] resultado = new int[2][2];

        // Multiplicação de matrizes
        for (int i = 0; i < 2; i++) { // linhas de mat1
            for (int j = 0; j < 2; j++) { // colunas de mat2
                for (int k = 0; k < 2; k++) { // percorre linha/coluna
                    resultado[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        // Exibir resultado
        System.out.println("Matriz Resultante:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
