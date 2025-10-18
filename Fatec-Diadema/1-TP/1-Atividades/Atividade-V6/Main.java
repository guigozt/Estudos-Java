
import java.util.Scanner;

class ContaCorrente {
    private String nomeCorrentista;
    private char sexoCorrentista; //M ou F
    private int idadeCorrentista;
    private int numeroConta;
    private char flagConjunta; // 'S' ou 'N'
    private double saldoConta;

    // Getters
    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public char getSexoCorrentista() {
        return sexoCorrentista;
    }

    public int getIdadeCorrentista() {
        return idadeCorrentista;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public char getFlagConjunta() {
        return flagConjunta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    // Setters
    public void setNomeCorrentista(String nome) {
        this.nomeCorrentista = nome;
    }

    public void setSexoCorrentista(char sexo) {
        this.sexoCorrentista = sexo;
    }

    public void setIdadeCorrentista(int idade) {
        this.idadeCorrentista = idade;
    }

    public void setNumeroConta(int numero) {
        this.numeroConta = numero;
    }

    public void setFlagConjunta(char flag) {
        this.flagConjunta = flag;
    }

    public void setSaldoConta(double saldo) {
        this.saldoConta = saldo;
    }

    //Metodos
    public void insercaoDados(Scanner entrada){
        System.out.print("Informe o Nome do Correntista: ");
        setNomeCorrentista(entrada.next());
        entrada.nextLine();
        System.out.print("Informe o Sexo do Correntista (M/F): ");
        setSexoCorrentista(entrada.next().toUpperCase().charAt(0));
        System.out.print("Informe a Idade do Correntista: ");
        setIdadeCorrentista(entrada.nextInt());
        System.out.print("Informe o Número da Conta: ");
        setNumeroConta(entrada.nextInt());
        System.out.print("A conta é Conjunta? (S/N): ");
        setFlagConjunta(entrada.next().toUpperCase().charAt(0));
        System.out.print("Informe o Saldo da Conta (R$): ");
        setSaldoConta(entrada.nextDouble());
    }

    public void impressaoDados(){
        System.out.println("\n=== Dados da Conta === \n");
        System.out.println("Nome: " + getNomeCorrentista());
        System.out.println("Sexo: " + getSexoCorrentista());
        System.out.println("Idade: " + getIdadeCorrentista());
        System.out.println("Conta: " + getNumeroConta());
        String flagConjntaString = (getFlagConjunta() == 'S') ? "Sim" : "Não";
        System.out.println("Conjunta: " + flagConjntaString);
        System.out.printf("Saldo: R$ %.2f", getSaldoConta());
        System.out.println();
    }

    public void menu(Scanner entrada){
        System.out.println("\n=== Menu de opções da Conta === \n");
        System.out.println("Digite [1] para Sacar");
        System.out.println("Digite [2] para Depositar");
        System.out.print("Digite sua opção: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("\nQuanto deseja Sacar? (R$): ");
                double valorSaque = entrada.nextDouble();
                saque(valorSaque);
                impressaoDados();
                break;
            case 2:
                System.out.print("\nQuanto deseja Depositar? (R$): ");
                double valorDeposito = entrada.nextDouble();
                deposito(valorDeposito);
                impressaoDados();
                break;
            default:
                throw new AssertionError();
        }
    }

    public void saque(double saque){
        if (saque > 0 && saque <= saldoConta){
            this.saldoConta -= saque;
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Não foi possivel realizar o saque!");
        }
    }

    public void deposito(double deposito){
        if(deposito > 0){
            this.saldoConta += deposito;
            System.out.println("Deposito realizado com sucesso!");
        }else{
            System.out.println("Não foi possivel realizar deposito!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            ContaCorrente conta1 = new ContaCorrente();

            System.out.println("Conta 1: ");
            conta1.insercaoDados(entrada);
            conta1.impressaoDados();
            conta1.menu(entrada);
            conta1.menu(entrada);

            ContaCorrente conta2 = new ContaCorrente();
            System.out.println("\nConta 2: ");
            conta2.insercaoDados(entrada);
            conta2.impressaoDados();
            conta2.menu(entrada);
            conta2.menu(entrada);

            ContaCorrente conta3 = new ContaCorrente();
            System.out.println("\nConta 3: ");
            conta3.insercaoDados(entrada);
            conta3.impressaoDados();
            conta3.menu(entrada);
            conta3.menu(entrada);

            System.out.print("\nObrigado por utilizar...");
        }
    }
}
