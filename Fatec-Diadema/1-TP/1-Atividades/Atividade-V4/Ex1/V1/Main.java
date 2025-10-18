import java.util.Scanner;

class ContaCorrente{
    public int numeroConta;
    public String nomeCliente;
    public String numeroCPF;
    public double saldoConta;

    ContaCorrente(int numero, String nome, String cpf, double saldo){
        numeroConta = numero;
        nomeCliente = nome;
        numeroCPF = cpf;
        saldoConta = saldo;
    }
}

public class Main{
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Informe o Número da Conta: ");
            int numero = entrada.nextInt();
            System.out.print("Informe o Nome do Cliente: ");
            String nome = entrada.nextLine();
            entrada.nextLine();
            System.out.print("Informe o Número do CPF: ");
            String cpf = entrada.nextLine();
            System.out.print("Informe o Saldo da Conta: ");
            double saldo = entrada.nextDouble();

            ContaCorrente novaConta = new ContaCorrente(numero, nome, cpf, saldo);

            System.out.println("\n=== Dados Pessoais ===\n");
            System.out.println("Número Conta: " + novaConta.numeroConta);
            System.out.println("Nome Cliente: " + novaConta.nomeCliente);
            System.out.println("Numero CPF: " + novaConta.numeroCPF);
            System.out.println("Saldo Conta: " + novaConta.saldoConta);
        }
    }
}