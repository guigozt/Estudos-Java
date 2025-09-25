
import java.io.IOException;
import java.util.Scanner;

public class Media2 {
 
    public static void main(String[] args) throws IOException {
 
        try(Scanner entrada = new Scanner(System.in)){
            double a = entrada.nextDouble();
            double b = entrada.nextDouble();
            double c = entrada.nextDouble();

            double media = (a*2.0 + b*3.0 + c*5.0) / 10.0;

            System.out.printf("MEDIA = %.1f%n", media);
        }
    }
}