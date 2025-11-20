
import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int[] vetor = new int[10];

            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("Digite um valor pra posição [%d]: ", i);
                vetor[i] = entrada.nextInt();
            }

            System.out.println("\n== Valores digitados == \n");

            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("Posição [%d] = %d \n", i, vetor[i]);
            }
        }
    }
}
