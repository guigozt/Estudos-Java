public class Matematica {
    public static void main(String[] args) {
        double[][] A = {
            {2, 4, 5},
            {0, 3, 6},
            {0, 0, 7}
        };

        System.out.print("Diagonal principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print((int)A[i][i] + (i < 2 ? ", " : "\n"));
        }

        double det = 1;
        for (int i = 0; i < 3; i++) det *= A[i][i];
        System.out.println("Determinante: " + (int)det);

        System.out.print("Autovalores: ");
        for (int i = 0; i < 3; i++) {
            System.out.print((int)A[i][i] + (i < 2 ? ", " : "\n"));
        }
    }
}
