class No{
    int valor;
    No esquerda;
    No direita;

    No(int valor){
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}

class ArvoreBST{
    No raiz;

    void inserir(int valor){
        raiz = inserirRec(raiz, valor);
    }

    No inserirRec(No atual, int valor){
        if (atual == null){
            return new No(valor);
        }

        if (valor < atual.valor){
            atual.esquerda = inserirRec(atual.esquerda, valor);
        }
        else if (valor > atual.valor){
            atual.direita = inserirRec(atual.direita, valor);
        }

        return atual;
    }

    boolean buscar(int valor){
        return buscarRec(raiz, valor);
    }

    boolean buscarRec(No atual, int valor){
        if (atual == null){
            return false;
        }

        if (atual.valor == valor){
            return true;
        }

        if (valor < atual.valor){
            return buscarRec(atual.esquerda, valor);
        }

        return buscarRec(atual.direita, valor);
    }
}

public class Main{
    public static void main(String[] args) {
        ArvoreBST arvore = new ArvoreBST();

        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(7);

        System.out.println(arvore.buscar(15));
        System.out.println(arvore.buscar(7));
        System.out.println(arvore.buscar(9));
    }
}