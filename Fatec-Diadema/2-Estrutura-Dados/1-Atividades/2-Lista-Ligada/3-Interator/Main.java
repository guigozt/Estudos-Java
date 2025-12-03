public class Main {
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<>();

        //Adicionando valores
        int limite = 100;
        System.out.println("ADICIONANDO VALORES\n");
        for (int i = 0; i < limite; i++) {
            lista.adicionar(i);
        }

        //Percorrer lista
        InteratorLista<Integer> interator = lista.getInterator();
        while (interator.temProximo()) { 
            interator.getProximo();
        }

        System.out.println("VALORES LIDOS...\n");
    }
}
