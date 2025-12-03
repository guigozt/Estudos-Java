public class ListaLigada<TIPO> {
    private No<TIPO> primeiro;
    private No<TIPO> ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public No<TIPO> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No<TIPO> primeiro) {
        this.primeiro = primeiro;
    }

    public No<TIPO> getUltimo() {
        return ultimo;
    }

    public void setUltimo(No<TIPO> ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(TIPO novoValor){
        No<TIPO> novo = new No<>(novoValor);

        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novo;
            this.ultimo = novo;
        }else{
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
        }
        this.tamanho ++;
    }

    public void remover(TIPO novoProcurado){
        No<TIPO> anterior = null;
        No<TIPO> atual = this.primeiro;

        for(int i=0; i < this.getTamanho(); i++){
            if (atual.getValor().equals(novoProcurado)){
                if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }
                else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }
                else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public No<TIPO> getElemento(int posicao){
        No<TIPO> atual = this.primeiro;

        for(int i=0; i < posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}