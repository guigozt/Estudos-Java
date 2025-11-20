import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a cotação do dólar atual (R$): ");
        double cotacao = entrada.nextDouble();

        System.out.print("Informe a quantidade de dólares que deseja converter: ");
        double dolares = entrada.nextDouble();

        double conversao = dolares * cotacao;

        System.out.println("O valor em reais é: R$ " + conversao);

        entrada.close();
    }
}
