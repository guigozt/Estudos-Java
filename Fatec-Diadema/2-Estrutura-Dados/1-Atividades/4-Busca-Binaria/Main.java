
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = i * 2;
            System.out.println(vetor[i]);
        }

        System.out.println("Qual número você busca?: ");
        Scanner sc = new Scanner(System.in);
        int busca = sc.nextInt(); 

        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        while(inicio <= fim){
            meio = (int)((inicio + fim) / 2);
            
            if (vetor[meio] == busca){
                achou = true;
                break;
            }
            else if (vetor[meio] < busca){
                inicio = meio + 1;
            }
            else{
                fim = meio - 1;
            }
        }

        if (achou){
            System.out.println("Achou!");
        }else{
            System.out.println("Não achou...");
        }
    }    
}
