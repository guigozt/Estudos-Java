import java.util.Scanner;

public class ControleVendas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] produtos = {"Camisas", "Calças", "Jaquetas", "Sapatos"};
        int[][] vendas = new int[3][4]; // 3 vendedores x 4 produtos

        // Ler dados da matriz
        for (int i = 0; i < 3; i++) {
            System.out.println("\nVendedor " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Quantidade vendida de " + produtos[j] + ": ");
                vendas[i][j] = entrada.nextInt();
            }
        }

        // Total geral
        int totalGeral = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                totalGeral += vendas[i][j];
            }
        }
        System.out.println("\n🔹 Total de peças vendidas pela loja: " + totalGeral);

        // Total por vendedor
        int[] totalVendedor = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                totalVendedor[i] += vendas[i][j];
            }
            System.out.println("Total vendido pelo Vendedor " + (i + 1) + ": " + totalVendedor[i]);
        }

        // Total por produto
        int[] totalProduto = new int[4];
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                totalProduto[j] += vendas[i][j];
            }
            System.out.println("Total de " + produtos[j] + " vendidas: " + totalProduto[j]);
        }

        // Vendedor que mais vendeu
        int melhorVendedor = 0;
        for (int i = 1; i < 3; i++) {
            if (totalVendedor[i] > totalVendedor[melhorVendedor]) {
                melhorVendedor = i;
            }
        }
        System.out.println("\nVendedor que mais vendeu: Vendedor " + (melhorVendedor + 1) + " com " + totalVendedor[melhorVendedor] + " peças.");

        // Produto mais vendido
        int melhorProduto = 0;
        for (int j = 1; j < 4; j++) {
            if (totalProduto[j] > totalProduto[melhorProduto]) {
                melhorProduto = j;
            }
        }
        System.out.println("Produto mais vendido: " + produtos[melhorProduto] + " com " + totalProduto[melhorProduto] + " peças.");
    }
}
