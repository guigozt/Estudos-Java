import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        int num1 = sc.nextInt();
        System.out.print("Número 2: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("\nSOMA = " + soma);
        sc.close();
    }
}