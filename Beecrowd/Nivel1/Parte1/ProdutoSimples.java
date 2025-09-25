
import java.io.IOException;
import java.util.Scanner;
 
public class ProdutoSimples {
 
    public static void main(String[] args) throws IOException {
 
        try(Scanner entrada = new Scanner(System.in)){
            int n1 = entrada.nextInt();
            int n2 = entrada.nextInt();
            int prod = n1 * n2;

            System.out.println("PROD = " + prod);
        }
    }
}