class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return """
               === C\u00cdRCULO ===
               Raio: """ + raio + "\n" +
               "Área: " + String.format("%.2f", calcularArea()) + "\n" +
               "Perímetro: " + String.format("%.2f", calcularPerimetro());
    }
}