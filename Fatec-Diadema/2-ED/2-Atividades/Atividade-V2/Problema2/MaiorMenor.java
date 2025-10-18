
import java.util.Arrays;

public class MaiorMenor {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int maior = vetor[0];
        int menor = vetor[0];

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] >= maior){
                maior = vetor[i];
            }

            if(vetor[i] <= menor){
                menor = vetor[i];
            }
        }
        System.out.println("Vetor gerado: " + Arrays.toString(vetor));
        System.out.println("\nO maior valor do vetor é: " + maior);
        System.out.println("O menor valor do vetor é: " + menor);
    }
}
