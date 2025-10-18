public class SistemaLinear{
    public static void main(String[] args) {
        double[][] A = {
            {3, 1},
            {2, 4}
        };

        double[] b = {5, 6};
        
        double x = 0, y = 0; //Chute inicial
        double erro = 0.0001;
        int maxInteracao = 10;

        System.out.println("Iterações do método de Gauss-Seidel:\n");

        for (int i = 0; i < maxInteracao; i++) {
            double xNovo = (b[0] - A[0][1] * y) / A[0][0]; //5 - 1y * y / 3
            double yNovo = (b[1] - A[1][0] * xNovo) / A[1][1]; //6 - 2x * xNovo / 4
            
            System.out.printf("Interação %d: x = %.3f | y = %.3f\n", i+1, xNovo, yNovo);

            if(Math.abs(xNovo - x) < erro && Math.abs(yNovo - y) < erro){
                break;
            }

            x = xNovo;
            y = yNovo;
        }

        System.out.printf("\nSolução aproximada: x = %.3f | y = %.3f", x, y);
    }
}