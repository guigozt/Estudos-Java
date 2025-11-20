public class Main{
    public static int somaNumeros(int n){
        
        if(n == 1){
            return 1;
        }

        return n + somaNumeros(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Soma: " + somaNumeros(5));
    }
}