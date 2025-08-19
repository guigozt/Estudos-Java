
import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        // Nome: Guilherme Gomes da Silva
        // RA: 2171392511043
        // Objetivo: Faça um programa na Linguagem Java que calcule a área da
        // circunferência
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o RAIO: ");
        double raio = entrada.nextFloat();

        double areaC = Math.PI * Math.pow(raio, 2);

        System.out.println("Area da circunferencia: " + areaC);
        entrada.close();
    }
}
