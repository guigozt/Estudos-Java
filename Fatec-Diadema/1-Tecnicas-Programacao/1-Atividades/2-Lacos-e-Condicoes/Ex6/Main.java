import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Informe o código do lanche: ");
            int codigo = entrada.nextInt();
            System.out.print("Informe a quantidade: ");
            int quantidade = entrada.nextInt();

            switch(codigo){
                case 100 -> {
                    double preco = 1.20 * quantidade;
                    System.out.printf("%d Cachorro quente por R$ %.2f", quantidade, preco);
                }
                case 101 -> {
                    double preco = 1.30 * quantidade;
                    System.out.printf("%d Bauru simples por R$ %.2f", quantidade, preco);
                }
                case 102 -> {
                    double preco = 1.50 * quantidade;
                    System.out.printf("%d Bauru com ovo por R$ %.2f", quantidade, preco);
                }
                case 103 -> {
                    double preco = 1.20 * quantidade;
                    System.out.printf("%d Hambúrger por R$ %.2f", quantidade, preco);
                }
                case 104 -> {
                    double preco = 1.30 * quantidade;
                    System.out.printf("%d Cheeseburguer por R$ %.2f", quantidade, preco);
                }
                case 105 -> {
                    double preco = 1.0 * quantidade;
                    System.out.printf("%d Refrigerante por R$ %.2f", quantidade, preco);
                }
                default -> {
                    System.out.println("Erro");
                }
            }
        }
    }
}
