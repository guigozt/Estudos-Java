public class Main {
    public static void main(String[] args) {
        Transporte[] transportes = {
            new Carro(),
            new Bicicleta(),
            new Aviao()
        };

        for(Transporte trans : transportes){
            trans.mover();
        }
    }
}
