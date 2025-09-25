
import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int distancia = input.nextInt();
        double combustivel = input.nextDouble();

        double consumo = distancia / combustivel;

        // Imprime com 3 casas decimais, no mesmo formato pedido
        System.out.printf("%.3f km/l%n", consumo);

        input.close();
    }
}