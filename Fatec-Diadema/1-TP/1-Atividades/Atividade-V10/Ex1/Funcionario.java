public class Funcionario{
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String n, String cpf, double sal) {
        this.nome = n;
        this.cpf = cpf;
        this.salario = sal;
    }

    public String getNome(){ return nome; }
    public String getCPF(){ return cpf; }
    public double getSalario(){ return salario; }

    public void setNome(String n){ nome = n; }
    public void setCPF(String cpf){ this.cpf = cpf; }
    public void setSalario(double sal){ salario = sal; }

    public void imprimeDados(){
        System.out.println("=== DADOS DO FUNCIONARIO === \n");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.printf("Salário: R$ %.2f \n", salario);
        System.out.println();
    }
}