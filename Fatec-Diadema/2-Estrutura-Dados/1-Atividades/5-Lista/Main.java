class No{
    int valor;
    No proximo;

    No(int va){
        this.valor = va;
        this.proximo = null;
    }
}

class ListaLigada{
    No inicio;

    public void adicionarFinal(int va){
        No novo = new No(va);

        System.out.println("=== ADICIONAR VALOR === \n");

        if(inicio == null){
            inicio = novo;
        }else{
            No atual = inicio;

            while(atual.proximo != null){
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }

        System.out.printf("Valor: %s adicionado!", novo.valor);
    }

    public void removerInicio(){
        System.out.println("=== REMOVER O PRIMEIRO VALOR === \n");
        if(inicio == null){
            System.out.println("Lista vazia");
        }else{
            No removido = inicio;
            inicio = inicio.proximo;

            removido.proximo = null;
            System.out.printf("Valor %s removido!", removido.valor);
        }        
    }
}