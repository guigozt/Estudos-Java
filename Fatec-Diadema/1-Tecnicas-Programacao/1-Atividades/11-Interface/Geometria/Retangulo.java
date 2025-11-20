class Retangulo implements FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return """
               === RET\u00c2NGULO ===
               Base: """ + base + "\n" +
               "Altura: " + altura + "\n" +
               "Área: " + String.format("%.2f", calcularArea()) + "\n" +
               "Perímetro: " + String.format("%.2f", calcularPerimetro());
    }
}