
import java.util.Scanner;

class Funcionario{
    private String nomeFuncionario;
    private double salarioBrutoFuncionario;
    private double descontoSalario;
    private double aumentoSalario = -1;

    Funcionario(String nome, double salario, double desconto){
        nomeFuncionario = nome;
        salarioBrutoFuncionario = salario;
        descontoSalario = desconto;
    }

    public double salarioLiquido(){
        return salarioBrutoFuncionario - descontoSalario;
    }

    public void imprimeDados(){
        System.out.println("\n=== Dados do funcionário === \n");
        System.out.println("Nome: " + nomeFuncionario);

        if(aumentoSalario == -1){
            System.out.printf("Salário Liquido: R$ %.2f\n",  salarioLiquido());
        }
        else{
            System.out.printf("Salário Liquido: R$: %.2f\n", aumentoSalario);
        }
    }

    public void aumentoSalario(double porcentagem){
        double salarioL = salarioLiquido();
        aumentoSalario = salarioL + (salarioL * (porcentagem / 100));
    }
}

public class Main {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Nome funcionário: ");
            String nome = entrada.nextLine();
            System.out.print("Salário Bruto: ");
            double salario = entrada.nextDouble();
            System.out.print("Desconto: ");
            double desconto = entrada.nextDouble();

            Funcionario funcionario = new Funcionario(nome, salario, desconto);

            funcionario.imprimeDados();

            System.out.print("\n\nQuantos será o aumento desse funcionario?(%): ");
            double porcentagem = entrada.nextDouble();
            funcionario.aumentoSalario(porcentagem);

            funcionario.imprimeDados();
            
        }
    }
}
