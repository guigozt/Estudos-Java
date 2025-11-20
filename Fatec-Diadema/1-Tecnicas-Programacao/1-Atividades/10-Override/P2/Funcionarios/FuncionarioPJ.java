public class FuncionarioPJ extends Funcionario {
    private double valorHora;
    private double horasTrabalhadas;

    public FuncionarioPJ(String nm, int mat, double valorHora, double horasTrabalhadas) {
        super(nm, mat);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}