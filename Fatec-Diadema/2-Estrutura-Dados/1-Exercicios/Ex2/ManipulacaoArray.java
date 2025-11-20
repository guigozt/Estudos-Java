public class ManipulacaoArray {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;

        //Somar
        for (int i : valores){
            soma += i;
        }
        System.out.println("Soma total dos valores: " + soma);

        //Percorrer
        for (int cont = 0; cont < 6; cont++){
            int indiceC = cont % valores.length;
            System.out.println("Indice: " + indiceC + " Valor: " + valores[indiceC]);
        }
    }
}
