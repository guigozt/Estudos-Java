import java.util.Scanner;

public class Main{
    public static int buscaLinear(String[] nomes, String alvo){
        for (int i=0; i<nomes.length; i++) {
            if(nomes[i].equals(alvo)){
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String[] nomes = {"Guilherme", "Giulia", "Gustavo"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome que quer buscar: ");
        String busca = sc.nextLine();

        int posicao = buscaLinear(nomes, busca);

        if(posicao != -1){
            System.out.println("Nome encontrado na posição: " + posicao);
        }else{
            System.out.println("Nome não encontrado...");
        }

        sc.close();
    }
}