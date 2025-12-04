public class Arvore<TIPO> {
    private Elemento<TIPO> raiz;

    public Arvore<TIPO extends Comparable>(){
        this.raiz = null;    
    }

    public Elemento<TIPO> getRaiz(){
        return raiz;
    }

    public void adicionar(TIPO valor){
        Elemento<TIPO> novoElemento = new Elemento<>(valor);

        if (raiz == null){
            this.raiz = novoElemento;
        }
        else{
            Elemento<TIPO> atual = this.raiz;
            while(true){
                if (novoElemento.getValor().compareTo(atual.getValor()) == -1){
                    if (atual.getEsquerda() != null){
                        atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                }
                else{
                    if (atual.getDireita() != null){
                        atual = atual.getDireita(); 
                    }else{
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }

    public void posOrdem(Elemento<TIPO> atual){
        if (atual != null){
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }
    }
}
