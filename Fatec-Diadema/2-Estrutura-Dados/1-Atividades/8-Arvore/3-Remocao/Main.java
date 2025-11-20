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

    void inOrder(No atual){
        if (atual != null){
            inOrder(atual.esquerda);
            System.out.println(atual.valor + " ");
            inOrder(atual.direita);
        }
    }

    void preOrder(No atual){
        if (atual != null){
            System.out.println(atual.valor + " ");
            preOrder((atual.esquerda));
            preOrder(atual.direita);
        }
    }

    void postOrder(No atual){
        if (atual != null){
            postOrder(atual.esquerda);
            postOrder(atual.direita);
            System.out.println(atual.valor + " ");
        }
    }

    void remover(int valor){
        raiz = removerRec(raiz, valor);
    }

    No removerRec(No atual, int valor){
        if (atual == null) return null;

        if (valor < atual.valor){
            atual.esquerda = removerRec(atual.esquerda, valor);
        }
        else if (valor > atual.valor){
            atual.direita = removerRec(atual.direita, valor);
        }
        else{
            //Caso 1: sem filhas
            if (atual.esquerda == null && atual.direita == null){
                return null;
            }

            //Caso 2: um filho
            if (atual.esquerda == null) return atual.direita;
            if (atual.direita == null) return atual.esquerda;

            //Caso 3: dois filhos
            No sucessor = menorValor(atual.direita);
            atual.valor = sucessor.valor;
            atual.direita = removerRec(atual.direita, sucessor.valor);
        }

        return atual;
    }

    No menorValor(No atual){
        while (atual.esquerda != null){
            atual = atual.esquerda;
        }
        return atual;
    }
}

public class Main{
    public static void main(String[] args) {
        ArvoreBST arvore = new ArvoreBST();

        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(12);

        System.out.println(arvore.buscar(15));
        System.out.println(arvore.buscar(5));
        System.out.println(arvore.buscar(9));

        System.out.print("In-order: ");
        arvore.inOrder(arvore.raiz);
        System.out.println();

        System.out.print("Pre-order: ");
        arvore.preOrder(arvore.raiz);
        System.out.println();

        System.out.print("Post-order: ");
        arvore.postOrder(arvore.raiz);
        System.out.println();

        arvore.remover(10);
        arvore.inOrder(arvore.raiz);
    }
}