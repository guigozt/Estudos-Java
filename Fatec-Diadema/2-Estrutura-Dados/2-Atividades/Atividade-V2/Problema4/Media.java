
import java.util.Arrays;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double[] notas = new double[5];

        try(Scanner entrada = new Scanner(System.in)){

            for(int i = 0; i < notas.length; i++){
                System.out.printf("Informe a Nota do %dº Aluno: ", i+1);
                notas[i] = entrada.nextDouble();
            }
        }
        int somaNotas = 0;
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i]; 
        }

        media = somaNotas / notas.length;
        System.out.println("\nNotas dos alunos: " + Arrays.toString(notas));
        System.out.printf("Média das notas: %.1f", media);
    }
}
