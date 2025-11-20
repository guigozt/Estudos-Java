public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Fiesta", 2020, 4);
        Moto moto = new Moto("Honda", "CB 500", 2021, 500);
        carro.imprimeDados();
        moto.imprimeDados();
    }
}
