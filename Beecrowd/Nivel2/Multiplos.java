
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int num1 = entrada.nextInt();
            int num2 = entrada.nextInt();

            if (num1 % num2 == 0 || num2 % num1 == 0){
                System.out.println("Sao Multiplos");
            }
            else{
                System.out.println("Nao sao Multiplos");
            }
        }
    }
}
