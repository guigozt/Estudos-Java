import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputDados = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        float num1 = inputDados.nextFloat();

        System.out.print("Digite o 2º número: ");
        float num2 = inputDados.nextFloat();

        float mult = num1 * num2;
        System.out.println("O resultado da multiplicação = " + mult);

        inputDados.close();
    }
}