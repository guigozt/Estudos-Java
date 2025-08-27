
import java.util.Scanner;

public class Circuferencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o RAIO: ");
        double raio = entrada.nextFloat();

        double areaC = Math.PI * Math.pow(raio, 2);

        System.out.println("Area da circuferencia: " + areaC);
        entrada.close();
    }
}
