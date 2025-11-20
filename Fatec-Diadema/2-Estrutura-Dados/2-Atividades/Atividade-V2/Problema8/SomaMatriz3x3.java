
import java.util.Scanner;

public class SomaMatriz3x3 {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int[][] mat = new int[3][3];
            int soma = 0;

            for(int l = 0; l < mat.length; l++){
                for(int c = 0; c < mat[l].length; c++){
                    System.out.printf("Valor para Matriz: linha[%d] coluna[%d]: ", l, c);
                    mat[l][c] = entrada.nextInt();
                    soma += mat[l][c];
                }
            }

            System.out.println("\nSoma dos elementos da Matriz: " + soma);
        }
    }
}
