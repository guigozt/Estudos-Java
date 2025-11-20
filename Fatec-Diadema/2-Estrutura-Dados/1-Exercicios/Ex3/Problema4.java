
import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int[] vetor = new int[8];
            int maior = vetor[0];
            int menor = vetor[0];

            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("Digite um valor para a posição [%d]: ", i);
                vetor[i] = entrada.nextInt();
            }

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] >= maior){
                    maior = vetor[i];
                }
            }

            for (int i = 0; i < vetor.length; i++) {
                if(vetor[i] <= menor){
                    menor = vetor[i];
                }
            }

            System.out.println("\n == Resultado == \n");

            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }
    }    
}
