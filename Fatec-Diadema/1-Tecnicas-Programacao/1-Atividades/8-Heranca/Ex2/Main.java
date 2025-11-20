public class Main{
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("A1040", 2018);
        Onibus onibus = new Onibus("A1027", 2020, 20);
        Caminhao caminhao = new Caminhao("A1030", 2015, 3);

        veiculo.exibeDados();
        onibus.exibeDados();
        caminhao.exibeDados();
    }
}