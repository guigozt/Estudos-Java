public class Grafo {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 1, 0},  //A -> A,B
            {0, 0, 1},  //B -> C
            {0, 0, 0}   //C -> nenhum
        };

        System.out.println("Matriz de Adjacência: \n");
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                System.out.print(matriz[l][c] + " | ");
            }
            System.out.println();
        }

        for(int i = 0; i < matriz.length; i++){
            if(matriz[i][i] == 1){
                System.out.println("\nO vertice " + (char)('A' + i) + " possui um auto-laço");
            }
        }

        char origem = 'A';
        char destino = 'B';

        int linha = origem - 'A';
        int coluna = destino - 'A';

        if(matriz[linha][coluna] == 1){
            System.out.println(origem + " É vizinho de " + destino);
        }else{
            System.out.println(origem + "Não é vizinho de " + destino);
        }
    }
}
