
import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int[] vetor = new int[10];

            for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite um valor para a posição [%d]: ", i);
            vetor[i] = entrada.nextInt();
            }

            System.out.println("\n == Vetor inverso == \n");

            for(int i = vetor.length - 1; i >= 0; i--){
                System.out.printf("Indice [%d] = %d \n", i, vetor[i]);
            }
        }
    }
}
