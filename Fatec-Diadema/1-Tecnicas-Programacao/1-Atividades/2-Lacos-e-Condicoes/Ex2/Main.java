import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Digite a 1ª nota: ");
            double notas1 = entrada.nextDouble();
            System.out.print("Digite a 2ª nota: ");
            double notas2 = entrada.nextDouble();
            System.out.print("Digite a 3ª nota: ");
            double notas3 = entrada.nextDouble();
            System.out.print("Digite a 4ª nota: ");
            double notas4 = entrada.nextDouble();

            double media = (notas1 + notas2 + notas3 + notas4) / 4;

            if (media >= 7.0){
                System.out.println("ALUNO APROVADO! com a média: " + media);
            }
            else{
                System.out.println("ALUNO REPROVADO! com a média: " + media);
            }
        }
    }    
}
