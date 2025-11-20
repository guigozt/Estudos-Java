public class Ex2 {
    public static void main(String[] args) {
        int[][] M = {
            {1,2,3},
            {4,5,6}
        };

        for(int coluna = 0; coluna < M[0].length; coluna++){ //Acessa a quantidade de colunas na linha 0 = 3 (0,1,2)
            for(int linha = 0; linha < M.length; linha++){  //Dentro de cada coluna, percorre as linhas = 2 (0,1)
                System.out.print(M[linha][coluna] + " | ");
            }
            System.out.println();
        }
    }
}
