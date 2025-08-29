
import java.util.Scanner;

public class ParImparNegPos {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int qtdPar = 0; 
            int qtdImpar = 0; 
            int qtdNegativo = 0; 
            int qtdPositivo = 0;

            for (int i = 0; i < 5; i++){
                int num = entrada.nextInt();

                if (num % 2 == 0){
                    qtdPar ++;
                }
                else{
                    qtdImpar ++;
                }

                if (num > 0){
                    qtdPositivo ++;
                }
                else if (num < 0){
                    qtdNegativo ++;
                }
            }

            System.out.println(qtdPar + " valor(es) par(es)");
            System.out.println(qtdImpar + " valor(es) impar(es)");
            System.out.println(qtdPositivo + " valor(es) positivo(s)");
            System.out.println(qtdNegativo + " valor(es) negativo(es)");
        }
    }
}
