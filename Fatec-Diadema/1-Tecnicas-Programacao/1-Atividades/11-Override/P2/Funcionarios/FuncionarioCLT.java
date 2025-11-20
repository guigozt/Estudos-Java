public class FuncionarioCLT extends Funcionario {
    private double salarioFixo;
    private double desconto; // ex: 0.1 = 10%

    public FuncionarioCLT(String nm, int mat, double salarioFixo, double desconto) {
        super(nm, mat);
        this.salarioFixo = salarioFixo;
        this.desconto = desconto;
    }

    @Override
    public double calcularSalario() {
        return salarioFixo - (salarioFixo * desconto);
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}