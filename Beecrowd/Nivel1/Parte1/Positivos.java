
import java.io.IOException;
import java.util.Scanner;

public class Positivos {
    public static void main(String[] args) throws IOException {
        try(Scanner entrada = new Scanner(System.in)){
            int qtdPositivos = 0;

            for (int i = 0; i < 6; i++) {
                double valor = entrada.nextDouble();

                if(valor > 0){
                    qtdPositivos ++;
                }
            }

            System.out.println(qtdPositivos + " valores positivos");
        }
    }
}
