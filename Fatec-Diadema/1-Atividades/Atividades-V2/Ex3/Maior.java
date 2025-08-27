
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("1º Número: ");
            int num1 = entrada.nextInt();
            System.out.print("2º Número: ");
            int num2 = entrada.nextInt();
            System.out.print("3º Número: ");
            int num3 = entrada.nextInt();

            //int maior = Math.max(num1, Math.max(num2, num3));
            //System.out.println("O maior entre eles é: " + maior);
            
            if (num1 >= num2 && num1 >= num3){
                System.out.println("Maior: " + num1);
            }
            else if (num2 >= num1 && num2 >= num3){
                System.out.println("Maior: " + num2);
            }
            else{
                System.out.println("Maior: " + num3);
            }
        }
    }
}
