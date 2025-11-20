import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o RAIO da lata: ");
        float raio = entrada.nextFloat();

        System.out.print("Informe a ALTURA da lata: ");
        float altura = entrada.nextFloat();

        double volume = 3.14159 * Math.pow(raio, 2) * altura;
        System.out.println("Volume da lata de oleo é de: " + volume);
    }
}
