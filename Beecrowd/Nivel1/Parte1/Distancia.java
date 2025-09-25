
import java.io.IOException;
import java.util.Scanner;

public class Distancia {
 
    public static void main(String[] args) throws IOException {
 
        try(Scanner entrada = new Scanner(System.in)){
            double x1 = entrada.nextDouble();
            double y1 = entrada.nextDouble();
            double x2 = entrada.nextDouble();
            double y2 = entrada.nextDouble();
            
            double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            
            System.out.printf("%.4f%n", distancia);
        }
    }
}