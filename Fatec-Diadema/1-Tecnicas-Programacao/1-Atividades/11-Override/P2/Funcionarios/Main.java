public class Main {
    public static void main(String[] args) {
        FuncionarioCLT f1 = new FuncionarioCLT("Maria", 101, 3000.00, 0.1);
        FuncionarioPJ f2 = new FuncionarioPJ("João", 102, 80.0, 160);

        System.out.println(" FUNCIONARIO CLT \n");
        System.out.println(f1.getNome() + " - Salário: R$ " + f1.calcularSalario());
        System.out.println(" FUNCIONARIO PJ \n");
        System.out.println(f2.getNome() + " - Salário: R$ " + f2.calcularSalario());
    }
}

