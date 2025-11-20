class No {
    int valor;
    No proximo;

    No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class Fila {
    No inicio;
    No fim;   

    Fila() {
        inicio = null;
        fim = null;
    }

    public void enfileirar(int valor) {
        No novo = new No(valor);
        if (fim != null) {
            fim.proximo = novo;
        }
        fim = novo;
        if (inicio == null) {
            inicio = novo;
        }
        System.out.println("Enfileirado: " + valor);
    }

    public int desenfileirar() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return -1;
        }
        int valorRemovido = inicio.valor;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        System.out.println("Desenfileirado: " + valorRemovido);
        return valorRemovido;
    }

    public void exibir() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.println("Fila atual:");
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Fila filaBanco = new Fila();

        filaBanco.enfileirar(101);
        filaBanco.enfileirar(102);
        filaBanco.enfileirar(103);

        filaBanco.exibir();

        System.out.println("Atendendo clientes...");
        filaBanco.desenfileirar();
        filaBanco.exibir();
    }
}




 