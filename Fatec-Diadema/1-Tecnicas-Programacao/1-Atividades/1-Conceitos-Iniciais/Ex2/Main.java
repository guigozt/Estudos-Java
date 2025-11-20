import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a temperatura (°C): ");
        float grausC = entrada.nextFloat();

        float grausF = (9 * grausC + 160) / 5;
        System.out.println("A temperatura " + grausC + " °C convertida é igual a " + grausF + " °F");

        entrada.close();
    }
}
