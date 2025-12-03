public class ListaCliente {
    public static void main(String[] args) {
        ListaLigada<Cliente> cliente = new ListaLigada<>();

        cliente.adicionar(new Cliente("123", "Guilherme"));
        cliente.adicionar(new Cliente("456", "Giulia"));
        cliente.adicionar(new Cliente("789", "Gustavo"));

        System.out.println("Tamanho: " + cliente.getTamanho());
        for(int i = 0; i < cliente.getTamanho(); i++){
            System.out.println(cliente.getElemento(i).getValor());
        }   
    }
}
