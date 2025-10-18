import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Nome: Guilherme Gomes da Silva
        // RA: 2171392511043
        // Objetivo: Faça um programa na Linguagem Java que leia uma temperatura em
        // graus Fahrenheit e apresentá-la convertida em graus Celsius. A formula de
        // conversão é C <-- (F - 32) * (5/9), sendo f a temperatura em Fahrenheit e C a
        // temperatura em Celsius.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe os graus (°F): ");
        float grausF = entrada.nextFloat();

        float grausC = ((grausF - 32) * (5F / 9F));

        System.out.println("Os graus " + grausF + " °F convertido é igual a " + grausC + " °C");

        entrada.close();
    }
}