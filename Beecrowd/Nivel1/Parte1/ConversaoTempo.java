import java.io.IOException;
import java.util.Scanner;

public class ConversaoTempo {

    public static void calculaTempo(int t){
        int hora = 0;
        int min = 0;
        int seg = 0;

        hora = t / 3600;
        int restoH = t % 3600;

        min = restoH / 60;

        seg = restoH % 60;

        System.out.printf("%d:%d:%d%n", hora, min, seg);
    }
 
    public static void main(String[] args) throws IOException {
 
        try(Scanner entrada = new Scanner(System.in)){
            int tempo = entrada.nextInt();

            calculaTempo(tempo);
        }
    }
}