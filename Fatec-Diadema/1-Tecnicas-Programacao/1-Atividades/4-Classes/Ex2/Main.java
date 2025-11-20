
import java.util.Scanner;

class Aluno{
    public int numeroRA;
    public String nomeAluno;
    public String endereco;
    public String curso;

    Aluno(int ra, String nome, String end, String cur){
        numeroRA = ra;
        nomeAluno = nome;
        endereco = end;
        curso = cur;
    }
}

public class Main {
    //Nome: Guilherme Gomes da Silva
    //RA: 2171392511043
    //Objetivo: Fazer um programa para ler os dados de uma conta corrente: RA; Nome; Endereco; Curso. Em seguida, mostrar a tela todos os atributos. Utilize classe.
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Informe o Número do RA: ");
            int ra = entrada.nextInt();
            System.out.print("Informe o Nome do Aluno: ");
            String nome = entrada.nextLine();
            entrada.nextLine();
            System.out.print("Informe o Endereço do Aluno: ");
            String endereco = entrada.nextLine();
            System.out.print("Informe o Curso do Aluno: ");
            String curso = entrada.nextLine();

            Aluno novoAluno = new Aluno(ra, nome, endereco, curso);

            System.out.println("\n=== Dados do Aluno ===\n");
            System.out.println("Número RA: " + novoAluno.numeroRA);
            System.out.println("Nome Aluno: " + novoAluno.nomeAluno);
            System.out.println("Endereco: " + novoAluno.endereco);
            System.out.println("Curso do Aluno: " + novoAluno.curso);
        }
    }
}
