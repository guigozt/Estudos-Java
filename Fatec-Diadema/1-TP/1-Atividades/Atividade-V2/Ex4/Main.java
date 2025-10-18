import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("1º Número: ");
            int inicial = entrada.nextInt();
            int maior = inicial;
            int menor = inicial;

            for (int i = 2; i < 6; i++){
                System.out.printf("%dº Número: ", i);
                int proximo = entrada.nextInt();

                if (proximo >= maior){
                    maior = proximo;
                }

                if (proximo <= menor){
                    menor = proximo;
                }
            }

            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }
    }
}
