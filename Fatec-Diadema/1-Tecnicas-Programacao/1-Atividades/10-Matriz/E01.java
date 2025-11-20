public class Ex1 {
    public static void main(String[] args) {
        int[][] M = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int linha = 0; linha < M.length; linha++){
            for(int coluna=0; coluna < M[linha].length; coluna++){
                System.out.println(M[linha][coluna] + " | ");
            }
            System.out.println();
        }
    }    
}
