import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = new int[10];

        for(int i = 0; i < A.length; i++){
            B[i] = A[i] * 2;
        }

        System.out.println("Coleção A: " + Arrays.toString(A));
        System.out.println("Coleção B: " + Arrays.toString(B));
    }
}
