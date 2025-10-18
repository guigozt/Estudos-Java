import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor da prestação (R$): ");
        double valor = entrada.nextDouble();

        System.out.print("Informe a taxa de juros (%): ");
        double taxa = entrada.nextDouble();

        System.out.print("Informe o tempo de atraso (meses): ");
        int tempo = entrada.nextInt();

        double prestacao = valor + (valor * (taxa / 100) * tempo);

        System.out.println("Valor da prestação é de: R$ " + prestacao);
        entrada.close();
    }
}
