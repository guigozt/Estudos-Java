import java.util.Scanner;

public class TemperaturaF {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe os graus (°F): ");
        float grausF = entrada.nextFloat();

        float grausC = ((grausF - 32) * (5F / 9F));

        System.out.println("Os graus " + grausF + " °F convertido é igual a " + grausC + " °C");

        entrada.close();
    }
}