public class Main {
    public static void main(String[] args) {
        //Criando lista ligada
        ListaLigada lista = new ListaLigada();
        System.out.println();
        
        //Inserindo valores
        lista.adicionar("ACRE");
        lista.adicionar("BAHIA");
        lista.adicionar("CEARA");
        lista.adicionar("DISTRITO FEDERAL");
        System.out.println("Tamanho da Lista: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());
        System.out.println("Valor na posição 2: " + lista.getElemento(2).getValor());
        System.out.println("\n");

        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.getElemento(i).getValor());
        }

        //Removendo valores
        lista.remover("BAHIA");
        System.out.println("\nESTADO REMOVIDO... \n");

        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.getElemento(i).getValor());
        }

        //Removendo tudo
        System.out.println("\nREMOVENDO TODOS ESTADO...\n");

        lista.remover("ACRE");
        lista.remover("CEARA");
        lista.remover("DISTRITO FEDERAL");

        lista.adicionar("RIO DE JANEIRO");

        System.out.println("Tamanho: " + lista.getTamanho());
        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.getElemento(i).getValor());
        }
    }
}
