
import java.util.Scanner;

public class Bhaskara {
    public static void calcularBhascakara(double a, double b, double c){
        double delta = Math.pow(b, b) - (4 * a * c);
        if (a == 0 || delta < 0){
                System.out.println("Impossivel calcular");
        }else{
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }
    }

    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            double a = entrada.nextDouble();
            double b = entrada.nextDouble();
            double c = entrada.nextDouble();
            calcularBhascakara(a, b, c);
        }
    }    
}
