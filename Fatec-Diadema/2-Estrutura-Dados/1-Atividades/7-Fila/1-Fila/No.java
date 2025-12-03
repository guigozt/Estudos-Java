public class No{
    private String valor;
    private No proximo;

    public No(String valor) {
        this.valor = valor;
    }

    public String getValor(){ return valor; }
    public No getProximo(){ return proximo; }

    public void setValor(String v){ this.valor = v; }
    public void setProximo(No prox){ this.proximo = prox; }
}