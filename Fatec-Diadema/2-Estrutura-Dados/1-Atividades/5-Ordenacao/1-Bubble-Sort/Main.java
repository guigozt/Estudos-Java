import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        //BUBBLE SORT
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i+1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]){
                    int auxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = auxiliar;
                }
            }
        }

        System.out.println("Array Ordenado: " + Arrays.toString(vetor));
    }    
}
