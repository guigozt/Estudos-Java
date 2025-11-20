public class Moto extends Veiculo {
    @SuppressWarnings("FieldMayBeFinal")
    private int cilindradas;

    Moto(String ma, String mo, int y, int cl) {
        super(ma, mo, y);
        this.cilindradas = cl;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando moto...\n");
    }

    public void imprimeDados() {
        System.out.println("=== DADOS DA MOTO === \n");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cilindradas: " + cilindradas);
        acelerar();
    }
}
