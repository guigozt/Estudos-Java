
import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {
 
    public static void main(String[] args) throws IOException {
 
        try(Scanner entrada = new Scanner(System.in)){
            int n1 = entrada.nextInt();
            int n2 = entrada.nextInt();
            int soma = n1 + n2;

            System.out.println("SOMA = " + soma);
        }
    }
}