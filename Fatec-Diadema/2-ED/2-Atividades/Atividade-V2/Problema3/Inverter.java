
import java.util.Arrays;
import java.util.Scanner;

public class Inverter {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int[] vetor = new int[8];
            int[] vetorInvert = new int[8];

            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("Valor para posição [%d]: ", i);
                vetor[i] = entrada.nextInt();
            }

            for(int i = 0; i < vetor.length; i++){
                vetorInvert[i] = vetor[vetor.length - 1 - i];
            }

            System.out.println("1º Vetor: " + Arrays.toString(vetor));
            System.out.println("1º Vetor: " + Arrays.toString(vetorInvert));
        }
    }
}
