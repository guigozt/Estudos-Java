public class Moto extends Veiculo{
    private double valorBase;

    Moto(String ma, String mo, int y, double vl){
        super(ma, mo, y);
        this.valorBase = vl;
    }

    @Override
    public double calcularImposto(){
        return valorBase * (2.0 / 100);
    }

    @Override
    public void imprimeDetalhes(){
        super.imprimeDetalhes();
        System.out.printf("Valor Base: R$ %.2f", valorBase);
        System.out.printf("Imposto: R$ %.2f", calcularImposto());
        System.out.println("\n");
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
}
