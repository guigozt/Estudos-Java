import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor A: ");
        int A = sc.nextInt();
        System.out.print("Valor B: ");
        int B = sc.nextInt();
        System.out.print("Valor C: ");
        int C = sc.nextInt();
        System.out.print("Valor D: ");
        int D = sc.nextInt();

        int dif = A*B - C*D;

        System.out.println("DIFERENCA = " + dif);
        sc.close();
    }
}
