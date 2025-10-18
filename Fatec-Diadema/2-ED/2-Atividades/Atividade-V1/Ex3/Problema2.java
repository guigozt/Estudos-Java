
import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){

            int[] vetor = new int[10];
            int qtdPares = 0;

            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("Digite um valor para a posição [%d]: ", i);
                vetor[i] = entrada.nextInt();
            }

            System.out.println("\n == Valores Pares do Vetor == \n");

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] % 2 == 0){
                    qtdPares++;
                    System.out.printf("Posição [%d] = %d \n", i, vetor[i]);
                }
            }

            System.out.printf("Quantidade de valores pares: %d", qtdPares);
        }
    }    
}
