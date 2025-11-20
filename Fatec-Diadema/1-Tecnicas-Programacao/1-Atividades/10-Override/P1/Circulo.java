package P1;
public class Circulo extends Figura {
    double raio;
    double area;
    double diametro;

    public Circulo(double r, String cor) {
        super(cor);
        this.raio = r;
    }

    public void setRaio(double r){
        this.raio = r;
    }

    public double getRaio(){
        return raio;
    }

    public double area(){
        double pi = 3.14;
        this.area = pi * Math.pow(raio, 2);
        return area;
    }

    public double diametro(){
        this.diametro = 2 * raio;
        return diametro;
    }

    @Override
    public String toString(){
        return """
               === DADOS DO CIRCULO === 
               \nValor do Raio: """ + raio + "\n" + 
                "Valor do Diametro: " + diametro() + "\n" +
                "Valor da Area: " + area() + "\n" +
                "Cor: " + getCor();
    }
}
