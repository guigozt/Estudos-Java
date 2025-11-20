public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = {
            new Carro(),
            new Caminhao(),
            new Moto()
        };
        
        for(Veiculo v : veiculos){
            v.acelerar();
        }
    }
}
