import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nome: Guilherme Gomes da Silva
        // RA: 2171392511043
        // Objetivo: Faça um programa na Linguagem Java que receba um número e mostre o
        // resto da divisão por 6.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float num = entrada.nextFloat();

        float restoDiv = num % 6;

        System.out.println("O resto da divisão [" + num + "/6 ] é igual a: " + restoDiv);

        entrada.close();
    }
}
