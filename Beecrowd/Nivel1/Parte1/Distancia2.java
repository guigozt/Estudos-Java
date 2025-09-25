
import java.io.IOException;
import java.util.Scanner;

public class Distancia2 {
 
    public static void main(String[] args) throws IOException {
 
        try(Scanner entrada = new Scanner(System.in)){
            int distancia = entrada.nextInt();
            int tempoGasto = distancia * 2;

            System.out.println(tempoGasto +" minutos");
        }
    }
}