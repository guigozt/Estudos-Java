import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o ANO de seu nascimento: ");
        int anos = entrada.nextInt();

        System.out.print("Informe o MES de seu nascimento: ");
        int meses = entrada.nextInt();

        System.out.print("Informe o DIA de seu nascimento: ");
        int dias = entrada.nextInt();

        int idade = (anos * 365) + (meses * 30) + dias;

        System.out.println("A sua idade em dias é igual a: " + idade + " dias");

        entrada.close();
    }
}
