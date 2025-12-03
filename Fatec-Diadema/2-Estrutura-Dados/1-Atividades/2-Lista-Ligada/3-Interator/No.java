public class No <TIPO> {
    private TIPO valor;
    private No<TIPO> proximo;

    public No(TIPO valor) {
        this.valor = valor;
    }

    public TIPO getValor(){ return valor; }
    public No<TIPO> getProximo(){ return proximo; }

    public void setValor(TIPO v){ this.valor = v; }
    public void setProximo(No<TIPO> prox){ this.proximo = prox; }
}