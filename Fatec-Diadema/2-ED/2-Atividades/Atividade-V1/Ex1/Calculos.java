import java.util.Scanner;

public class Calculos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.err.print("Digite o 1º número: ");
        float numero1 = Integer.parseInt(entrada.nextLine());

        System.err.print("Digite o 2º número: ");
        float numero2 = Integer.parseInt(entrada.nextLine());

        float soma = numero1 + numero2;
        float sub = numero1 - numero2;
        float mult = numero1 * numero2; 
        float div = numero1 / numero2;

        System.out.print("Soma: " + soma);
        System.out.print("\nSubtraçao: " + sub);
        System.out.print("\nMultipicacao: " + mult);
        System.out.print("\nDivisao: " + div);

        entrada.close();
    }
}
