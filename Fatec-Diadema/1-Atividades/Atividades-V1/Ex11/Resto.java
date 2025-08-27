import java.util.Scanner;

public class Resto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float num = entrada.nextFloat();

        float restoDiv = num % 6;

        System.out.println("O resto da divisão [" + num + "/6 ] é igual a: " + restoDiv);

        entrada.close();
    }
}
