public abstract class Funcionario {
    protected String nome;
    protected int matricula;

    public Funcionario(String nm, int mat) {
        this.nome = nm;
        this.matricula = mat;
    }

    public void setNome(String nm) {
        this.nome = nm;
    }

    public void setMatricula(int mat) {
        this.matricula = mat;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public abstract double calcularSalario();
}