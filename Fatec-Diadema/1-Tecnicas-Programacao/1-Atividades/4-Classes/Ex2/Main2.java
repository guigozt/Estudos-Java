import java.util.Scanner;

class Aluno {
    public int numeroRA;
    public String nomeAluno;
    public String endereco;
    public String curso;

    Aluno(int ra, String nome, String end, String cur) {
        numeroRA = ra;
        nomeAluno = nome;
        endereco = end;
        curso = cur;
    }

    // Método para imprimir os dados
    public void imprimeDados() {
        System.out.println("\n=== Dados do Aluno ===\n");
        System.out.println("Número RA: " + numeroRA);
        System.out.println("Nome Aluno: " + nomeAluno);
        System.out.println("Endereco: " + endereco);
        System.out.println("Curso do Aluno: " + curso);
    }

    // Novo método simples para alterar o endereço
    public void alterarEndereco(String novoEnd) {
        endereco = novoEnd;
        System.out.println("Endereço atualizado com sucesso!");
    }
}

public class Main2 {
    // Nome: Guilherme Gomes da Silva
    // RA: 2171392511043
    // Objetivo: No exercício anterior crie 2 métodos.
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Informe o Número do RA: ");
            int ra = entrada.nextInt();
            entrada.nextLine(); // limpa o buffer do teclado

            System.out.print("Informe o Nome do Aluno: ");
            String nome = entrada.nextLine();

            System.out.print("Informe o Endereço do Aluno: ");
            String endereco = entrada.nextLine();

            System.out.print("Informe o Curso do Aluno: ");
            String curso = entrada.nextLine();

            Aluno novoAluno = new Aluno(ra, nome, endereco, curso);

            novoAluno.imprimeDados();

            // Usando o novo método
            System.out.print("\nDigite um novo endereço para o aluno: ");
            String novoEndereco = entrada.nextLine();
            novoAluno.alterarEndereco(novoEndereco);

            novoAluno.imprimeDados(); // mostra os dados atualizados
        }
    }
}
