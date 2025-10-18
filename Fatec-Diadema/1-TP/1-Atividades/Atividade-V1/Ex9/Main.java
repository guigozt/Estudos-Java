import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor para [A]: ");
        int a = entrada.nextInt();

        System.out.print("Digite um valor para [B]: ");
        int b = entrada.nextInt();

        int auxilar = b;
        b = a;
        a = auxilar;

        System.out.print("\n-------- Troca ------------\n");
        System.out.println("Valor de [A]: " + a);
        System.out.println("Valor de [B]: " + b);

        entrada.close();
    }
}
