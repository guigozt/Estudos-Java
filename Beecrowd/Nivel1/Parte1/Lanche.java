
import java.io.IOException;
import java.util.Scanner;

public class Lanche {

    public static void main(String[] args) throws IOException {
        try(Scanner entrada = new Scanner(System.in)){
            int codigo = entrada.nextInt();
            int quantidade = entrada.nextInt();
            double total = 0.0;

            switch (codigo) {
                case 1:
                    total = 4.0 * quantidade;
                    break;
                case 2:
                    total = 4.5 * quantidade;
                    break;
                case 3:
                    total = 5.0 * quantidade;
                    break;
                case 4:
                    total = 2.0 * quantidade;
                    break;
                case 5:
                    total = 1.5 * quantidade;
                    break;
                default:
                    throw new AssertionError();
            }

            System.out.printf("Total: R$ %.2f%n", total);
        }
    }
}