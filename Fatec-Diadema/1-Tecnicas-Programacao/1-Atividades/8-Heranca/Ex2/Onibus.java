public class Onibus extends Veiculo {
    private int assentos;

    Onibus(String placa, int ano, int ass){
        super(placa, ano);
        this.assentos = ass;
    }

    public int getAssentos(){ return assentos; }

    public void setAssentos(int ass){ this.assentos = ass; }

    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Assentos: " + assentos);
    }
}
