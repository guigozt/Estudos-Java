
import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            double[] vetor = new double[5];
            double soma = 0;

            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("Digite um valor para a posição [%d]: ", i);
                vetor[i] = entrada.nextDouble();
            }

            for (double valor : vetor){
                soma += valor;
            }
            
            double media = soma / vetor.length;

            System.out.println("\n == Resultado == \n");
            System.out.println("Soma dos números: " + soma);
            System.out.println("Média dos números: " + media);

        }
    }
}
