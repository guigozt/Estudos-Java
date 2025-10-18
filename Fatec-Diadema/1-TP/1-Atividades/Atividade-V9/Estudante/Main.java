package Estudante;
import java.util.Scanner;

class Estudante {
    private String nome;
    private int idade;
    private double mediaNotas;

    Estudante(String nome, int idade, double mediaNotas) {
        this.nome = nome;
        this.idade = idade;
        this.mediaNotas = mediaNotas;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public double getMediaNotas() { return mediaNotas; }
    public void setMediaNotas(double mediaNotas) { this.mediaNotas = mediaNotas; }

    public boolean foiAprovado() {
        return mediaNotas >= 7.0;
    }

    public void imprimirDados() {
        System.out.println("\n=== Dados do Estudante ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Média de Notas: " + mediaNotas);
        System.out.println("Situação: " + (foiAprovado() ? "Aprovado" : "Reprovado"));
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Informe o nome do estudante: ");
            String nome = sc.nextLine();

            System.out.print("Informe a idade do estudante: ");
            int idade = Integer.parseInt(sc.nextLine());

            System.out.print("Informe a média de notas do estudante: ");
            double media = Double.parseDouble(sc.nextLine());

            Estudante estudante = new Estudante(nome, idade, media);
            estudante.imprimirDados();
        }
    }
}
