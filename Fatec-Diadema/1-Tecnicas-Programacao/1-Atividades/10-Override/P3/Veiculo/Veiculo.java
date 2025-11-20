public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String ma, String mo, int y) {
        this.marca = ma;
        this.modelo = mo;
        this.ano = y;
    }

    public abstract double calcularImposto();

    public void imprimeDetalhes(){
        System.out.println("=== DETALHES SOBRE O " + getClass().getSimpleName().toUpperCase() + " === \n");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
