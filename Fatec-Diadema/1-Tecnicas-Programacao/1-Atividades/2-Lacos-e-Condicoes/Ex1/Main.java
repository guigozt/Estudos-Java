import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) 
        {
            System.out.print("Digite o 1º valor: ");
            int valor1 = entrada.nextInt();
            System.out.print("Digite o 2º valor: ");
            int valor2 = entrada.nextInt();
            System.out.print("Digite o 3º valor: ");
            int valor3 = entrada.nextInt();

            if (valor1 <= valor2 && valor2 <= valor3){
                System.out.println(valor1 + ", " + valor2 + ", " + valor3);
            }
            else if (valor1 <= valor3 && valor3 <= valor2){
                System.out.println(valor1 + ", " + valor3 + ", " + valor2);
            }
            else if (valor2 <= valor1 && valor1 <= valor3){
                System.out.println(valor2 + ", " + valor1 + ", " + valor3);
            }
            else if (valor2 <= valor3 && valor3 <= valor1){
                System.out.println(valor2 + ", " + valor3 + ", " + valor1);
            }
            else if (valor3 <= valor1 && valor2 <= valor1){
                System.out.println(valor3 + ", " + valor2 + ", " + valor1);
            }
            else{
                System.out.println(valor3 + ", " + valor1 + ", " + valor2);
            }
        }
    }
}
