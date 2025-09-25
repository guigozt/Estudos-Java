import java.util.Scanner;

public class IdadeDias {
    public static void calculoIdade(int id){
        int ano = 0;
        int mes = 0;
        int dia = 0;

        ano = id / 365;
        int restoAno = id % 365;

        mes = restoAno / 30;
        
        dia = restoAno % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }

    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int idade = entrada.nextInt();

            calculoIdade(idade);
        }
    }
}
