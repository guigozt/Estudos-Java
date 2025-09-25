import java.io.IOException;
import java.util.Scanner;

public class QuantPares {
    public static void main(String[] args) throws IOException {
        try(Scanner entrada = new Scanner(System.in)){
            int qtdPares = 0;

            for (int i = 0; i < 5; i++) {
                int valor = entrada.nextInt();

                if(valor % 2 == 0){
                    qtdPares ++;
                }
            }

            System.out.println(qtdPares + " valores pares");
        }
    }
}
