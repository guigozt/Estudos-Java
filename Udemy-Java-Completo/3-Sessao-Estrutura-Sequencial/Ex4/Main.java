import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();
        System.out.print("Valor: ");
        double valor = sc.nextDouble();

        double salario = horasTrabalhadas * valor;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f", salario);
        sc.close();
    }
}
