
import java.util.Arrays;

public class ColecaoMult {
    public static void main(String[] args) {
        // Nome: Guilherme Gomes da Silva'
        // RA: 2171392511043
        // Objetivo: Criar uma coleção “A” na linguagem Java com 10 elementos–	Inserir os elementos de 1 a 10 na coleção–	Criar uma outra coleção B que conterá o elemento da coleção A multiplicado por 2–	Mostrar as duas coleçõesObs. Não efetuar a leitura de 10 elementos
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = new int[10];

        for(int i = 0; i < A.length; i++){
            B[i] = A[i] * 2;
        }

        System.out.println("Coleção A: " + Arrays.toString(A));
        System.out.println("Coleção B: " + Arrays.toString(B));
    }
}
