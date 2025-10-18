public class Imagem {
    public static void main(String[] args) {
        // Matriz de pixels (imagem 4x4)
        int[][] imagem = {
            {10, 10, 10, 10},
            {10, 100, 100, 10},
            {10, 100, 100, 10},
            {10, 10, 10, 10}
        };

        int[][] filtro = {
            {-1, 0, 1},
            { 0, 0, 0},
            { 1, 0,-1}
        };

        int[][] resultado = new int[4][4];

        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                int soma = 0;

                for (int fi = 0; fi < 3; fi++) {
                    for (int fj = 0; fj < 3; fj++) {
                        soma += imagem[i + fi - 1][j + fj - 1] * filtro[fi][fj];
                    }
                }
                resultado[i][j] = soma;
            }
        }

        System.out.println("Matriz resultante após o filtro:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.printf("%4d", resultado[i][j]);
            }
            System.out.println();
        }
    }
}
