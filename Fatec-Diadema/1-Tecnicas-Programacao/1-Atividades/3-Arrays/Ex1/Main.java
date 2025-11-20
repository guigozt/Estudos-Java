import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] lista = new int[10];

        for (int i = 0; i < lista.length; i++){
            lista[i] = i + 1;
        }

        System.out.print(Arrays.toString(lista));
    }
}
