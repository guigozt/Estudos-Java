import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Número: ");
            int num = entrada.nextInt();
            int fatorial = num;

            for (int i = 1 ; i < num; i++){
                fatorial *= i;
            }

            System.out.printf("O fatorial de %d = %d", num, fatorial);
        }
    }
}
