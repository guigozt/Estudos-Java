
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void buscaLinear(int[] vetor, int valor){
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == valor){
                System.out.printf("Valor [%d] encontrado na posição: %d", valor, i);
                return;
            }
        }
        System.out.println("Valor não encontrado...");
    }

    public static void buscaBinaria(int[] vetor, int valor){
        int inicio = 0;
        int fim = vetor.length - 1;

        while(inicio <= fim){
            int meio = (inicio + fim) / 2;
            if(vetor[meio] == valor){
                System.out.printf("Valor [%d] encontrado na posição: %d", valor, meio);
                return;
            }else if(vetor[meio] < valor){
                inicio = meio + 1;
            }else{
                fim = meio - 1;
            }
        }
        System.out.println("Valor não encontrado!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para ser buscado: ");
        int valor = sc.nextInt();

        int[] vetor1 = new int[10000];
        int[] vetor2 = new int[10000];

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = (int) (Math.random() * 10000);
            vetor2[i] = (int) (Math.random() * 10000);
        }

        //Complexidade Linear - O(n)
        System.out.println("\n=== BUSCA LINEAR ===\n");

        long timeInicial = System.nanoTime();
        buscaLinear(vetor1, valor);
        long timeFinal = System.nanoTime();
        long duracaoLinear = timeFinal - timeInicial;

        System.out.printf("\nTempo de duração foi de: %d nano secundos", duracaoLinear);

        //Complexidade Binária - O(log n)
        System.out.println("\n\n=== BUSCA BINÁRIA ===\n");

        Arrays.sort(vetor2);
        timeInicial = System.nanoTime();
        buscaBinaria(vetor2, valor);
        timeFinal = System.nanoTime();
        long duracaoBinaria = timeFinal - timeInicial;

        System.out.printf("\nTempo de duração foi de: %d nano secundos", duracaoBinaria);

        sc.close();
    }
}