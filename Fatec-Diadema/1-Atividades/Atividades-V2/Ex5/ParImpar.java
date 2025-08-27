
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Digite um número: ");
            int num = entrada.nextInt();

            if (num % 2 == 0){
                System.out.println("O número " + num + " é PAR");
            }
            else{
                System.out.println("O número " + num + " é IMPAR");
            }
        }
    }
}
