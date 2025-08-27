public class Soma {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++){
            soma += i;
        }

        System.out.printf("A soma dos números no intervalo (1 até 100) = %d", soma);
    }
}
