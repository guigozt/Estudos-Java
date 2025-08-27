import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        int quadrado = num * num;

        System.out.println("O número " + quadrado + " é o quadrado de " + num);

        entrada.close();
    }
}
