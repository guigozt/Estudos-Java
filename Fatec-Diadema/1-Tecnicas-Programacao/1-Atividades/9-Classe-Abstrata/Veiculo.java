public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String ma, String mo, int y) {
        this.marca = ma;
        this.modelo = mo;
        this.ano = y;
    }

    public void acelerar() {
        System.out.println("Acelerando veículo...");
    }
}