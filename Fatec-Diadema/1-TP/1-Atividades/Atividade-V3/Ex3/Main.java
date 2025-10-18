import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            double[] primeiraProva = new double[5];
            double[] segundaProva = new double[5];
            double[] mediaNotas = new double[5];
            int contAluno = 0;

            while (contAluno < 5){
                System.out.printf("Informe a nota da 1ª prova do %d aluno: ", contAluno + 1);
                primeiraProva[contAluno] = entrada.nextDouble();
                System.out.printf("Informa a nota da 2º prova do %d aluno: ", contAluno + 1);
                segundaProva[contAluno] = entrada.nextDouble();

                mediaNotas[contAluno] = (primeiraProva[contAluno] + segundaProva[contAluno]) / 2;
                contAluno++;
            }
            System.out.println("\nMédia das notas dos alunos: \n");
            for (int i = 0; i < 5; i++){
                System.out.printf("%d Aluno: %.1f \n", i+1, mediaNotas[i]);
            }
        }
    }
}
