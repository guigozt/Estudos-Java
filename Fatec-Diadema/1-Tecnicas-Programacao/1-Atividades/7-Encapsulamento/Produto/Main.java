package Produto;
import java.util.Scanner;

class Produto {
    private String nome;
    private double precoUnitario;
    private int quantidadeEstoque;

    Produto(String nome, double precoUnitario, int quantidadeEstoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(double precoUnitario) { this.precoUnitario = precoUnitario; }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }

    public double calcularValorTotal() {
        return precoUnitario * quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Erro: quantidade a remover maior que o estoque atual!");
        }
    }

    public void imprimirDados() {
        System.out.println("\n=== Dados do Produto ===");
        System.out.println("Nome: " + nome);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("Valor Total em Estoque: R$ " + calcularValorTotal());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Informe o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Informe o preço unitário: ");
            double preco = Double.parseDouble(sc.nextLine());

            System.out.print("Informe a quantidade inicial em estoque: ");
            int quantidade = Integer.parseInt(sc.nextLine());

            Produto produto = new Produto(nome, preco, quantidade);
            produto.imprimirDados();

            System.out.print("Digite a quantidade a adicionar ao estoque: ");
            int add = Integer.parseInt(sc.nextLine());
            produto.adicionarEstoque(add);
            produto.imprimirDados();

            System.out.print("Digite a quantidade a remover do estoque: ");
            int rem = Integer.parseInt(sc.nextLine());
            produto.removerEstoque(rem);
            produto.imprimirDados();
        }
    }
}
