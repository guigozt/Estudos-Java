public class InteratorLista<TIPO> {
    private No<TIPO> elemento;

    public InteratorLista(No<TIPO> atual) {
        this.elemento = atual;
    }

    public boolean temProximo(){
        if (elemento.getProximo() == null){
            return false;
        }else{
            return true;
        }
    }

    public No<TIPO> getProximo(){
        elemento = elemento.getProximo();
        return elemento;
    }
}