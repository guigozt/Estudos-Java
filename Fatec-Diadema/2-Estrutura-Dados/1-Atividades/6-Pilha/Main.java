class No{
    int valor;
    No proximo;

    No(int va){
        this.valor = va;
        this.proximo = null;
    }
}

class Pilha{
    No topo;

    public Pilha() {
        topo = null;
    }

    public void empilar(int va){
        No novo = new No(va);

        novo.proximo = topo;
        topo = novo;
        System.out.println("Empilhado: " + va);
    }

    public int desempilhar(){
         System.out.println("\nDesfazendo última ação...");
        
        if(topo == null){
            System.out.println("Pilha vazia");
            return -1;
        }else{
            int removido = topo.valor;
            topo = topo.proximo;
            System.out.println("Desempilhado: " + removido);
            return removido;
        }
    }

    public void exibir(){
        if(topo == null){
            System.out.println("Pilha vazia!");
        }else{
            System.out.println("Conteudo da Pilha: \n");
            No atual = topo;
            while(atual != null){
                System.out.println(atual.valor);
                atual = atual.proximo;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pilha acoes = new Pilha();

        acoes.empilar(1);
        acoes.empilar(2);
        acoes.empilar(3);

        System.out.println("\nAções atuais:");
        acoes.exibir();

        acoes.desempilhar();

        System.out.println("\nAções restantes: ");
        acoes.exibir();
    }
}

