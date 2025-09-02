import java.util.Arrays;

public class Inserir {
    public static void main(String[] args) {
        // Nome: Guilherme Gomes da Silva'
        // RA: 2171392511043
        // Objetivo: Criar uma coleção na linguagem Java com 10 elementos–	Inserir os elementos de 1 a 10 no vetor - Após a inserção, somente após a inserção mostrar o vetor.Obs. Não efetuar a leitura de 10 elementos
        int [] lista = new int[10];

        for (int i = 0; i < lista.length; i++){
            lista[i] = i + 1;
        }

        System.out.print(Arrays.toString(lista));
    }
}
