public class Ex4 {
    public static void main(String[] args) {
        int [][] M = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, -1, -2, -3},
        {-4, -5, -6, -7}
    };

    int qtdPositivos = 0;

    for (int linha = 0; linha < M.length; linha++){
        for(int coluna = 0; coluna < M[linha].length; coluna++){
            if(M[linha][coluna] >= 0){
                qtdPositivos ++;
            }
        }
    }
    System.out.println("Quantidade de positivos: " + qtdPositivos);
}
}
