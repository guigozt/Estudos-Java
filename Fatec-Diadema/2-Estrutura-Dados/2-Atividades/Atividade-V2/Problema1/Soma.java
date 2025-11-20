
import java.util.Arrays;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int[] vetor = new int[10];
            int soma = 0;

            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("Digite um valor para a posição [%d]: ", i);
                vetor[i] = entrada.nextInt();
                soma += vetor[i];
            }

            System.out.println("\nVetor gerado: " + Arrays.toString(vetor));
            System.out.println("Soma de todos os valores do vetor: " + soma);
        }
    }
}
