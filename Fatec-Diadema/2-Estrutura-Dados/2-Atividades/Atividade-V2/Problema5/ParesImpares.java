
import java.util.Arrays;

public class ParesImpares {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12};
        int qtdPares = 0;
        int qtdImpares = 0;

        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                qtdPares += 1;
            }else{
                qtdImpares +=1;
            }
        }

        System.out.println("Vetor gerado: " + Arrays.toString(vetor));
        System.out.println("\nQuantidade de Pares: " + qtdPares);
        System.out.println("Quantidade de Impares: " + qtdImpares);
    }
}
