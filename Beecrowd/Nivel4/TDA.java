import java.util.Scanner;
import java.io.IOException;

public class TDA {

    public static int mdc(int nume, int deno) {
        while (deno != 0) {
            int aux = deno;
            deno = nume % deno;
            nume = aux;
        }
        return nume;
    }

    public static void main(String[] args) throws IOException {
        try (Scanner entrada = new Scanner(System.in)) {
            int casos = entrada.nextInt();

            for (int i = 0; i < casos; i++) {
                int n1 = entrada.nextInt();
                entrada.next(); // barra
                int d1 = entrada.nextInt();

                String operacao = entrada.next();

                int n2 = entrada.nextInt();
                entrada.next(); // barra
                int d2 = entrada.nextInt();

                int numerador = 0;
                int denominador = 0;

                switch (operacao) {
                    case "+" -> {
                        numerador = n1 * d2 + n2 * d1;
                        denominador = d1 * d2;
                    }
                    case "-" -> {
                        numerador = n1 * d2 - n2 * d1;
                        denominador = d1 * d2;
                    }
                    case "*" -> {
                        numerador = n1 * n2;
                        denominador = d1 * d2;
                    }
                    case "/" -> {
                        numerador = n1 * d2;
                        denominador = n2 * d1; 
                    }
                }

                int mdc = mdc(Math.abs(numerador), Math.abs(denominador));
                int numMDC = numerador / mdc;
                int denoMDC = denominador / mdc;

                System.out.printf("%d/%d = %d/%d\n", numerador, denominador, numMDC, denoMDC);
            }
        }
    }
}
