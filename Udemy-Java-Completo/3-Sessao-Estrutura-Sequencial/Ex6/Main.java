import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor A: ");
        double A = sc.nextDouble();
        System.out.print("Valor B: ");
        double B = sc.nextDouble();
        System.out.print("Valor C: ");
        double C = sc.nextDouble();

        System.out.printf("TRANGULO: %.3f", (A * C) / 2);
        System.out.printf("\nCIRCULO: %.3f", 3.14159 * Math.pow(C, 2));
        System.out.printf("\nTRAPEZIO: %.3f", (A + B) * C / 2);
        System.out.printf("\nQUADRADO: %.3f", Math.pow(B, 2));
        System.out.printf("\nRETANGULO: %.3f", A * B);
        sc.close();
    }    
}
