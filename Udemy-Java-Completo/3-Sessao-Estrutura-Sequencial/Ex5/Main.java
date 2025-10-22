import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoPeca1 = sc.nextInt();
        int numPeca1 = sc.nextInt();
        double precoPeca1 = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        int numPeca2 = sc.nextInt();
        double precoPeca2 = sc.nextDouble();

        double valorPagar = (numPeca1 * precoPeca1) + (numPeca2 * precoPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);
        sc.close();
    }    
}
