public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adicionar("Guilherme");
        fila.adicionar("Giulia");
        fila.adicionar("Gustavo");
        fila.adicionar("Maria");
        fila.adicionar("Thifany");
        System.out.println("Primeiro da FILA: " + fila.get());

        fila.remover();
        System.out.println("Novo Primeiro da FILA: " + fila.get());
    }    
}
