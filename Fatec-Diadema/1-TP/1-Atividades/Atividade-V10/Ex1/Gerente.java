
import java.util.Scanner;

public class Gerente extends Funcionario{
    private int senha;

    public Gerente(String n, String cpf, double sal, int s) {
        super(n, cpf, sal);
        this.senha = s;
    }

    public boolean autentica(){
        String resposta;
        int s;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== VERIFICANDO ACESSO === \n");

            System.out.printf("[%s] você quer acessar permissões de gerente? (S/N): ", getNome());
            resposta = sc.next().toUpperCase();
            System.out.printf("Digite sua senha: ");
            s = sc.nextInt();
        }

        return resposta.equals("S") && s == senha;
    }

    public void verificaPermissao(){
        if (autentica()){
            System.out.println("\nAcesso permitido!");
        }else{
            System.out.println("\nAcesso negado");
        }
    }
}