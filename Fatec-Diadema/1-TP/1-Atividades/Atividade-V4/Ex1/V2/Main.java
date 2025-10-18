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

    public void imprimeDados(){
        System.out.println("\n=== Dados Pessoais ===\n");
        System.out.println("Número Conta: " + numeroConta);
        System.out.println("Nome Cliente: " + nomeCliente);
        System.out.println("Numero CPF: " + numeroCPF);
        System.out.println("Saldo Conta: " + saldoConta);
    }

    public void depositar(double valor){
        if (valor > 0){
            saldoConta += valor;
        }
        else{
            System.out.println("\nValor não permitido! tente novamente mais tarde...");
        }
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

            novaConta.imprimeDados();

            System.out.print("\nQuantos R$ quer depositar na sua conta?: ");
            double valorDeposito = entrada.nextDouble();
            novaConta.depositar(valorDeposito);

            novaConta.imprimeDados();
        }
    }
}