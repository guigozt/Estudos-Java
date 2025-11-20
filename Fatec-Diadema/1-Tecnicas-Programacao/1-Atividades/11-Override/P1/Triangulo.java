package P1;
public class Triangulo extends Figura{
    private double base;
    private double altura;
    private double area;

    public Triangulo(double b, double a, String cor) {
        super(cor);
        this.base = b;
        this.altura = a;
    }

    public void setBase(double b){
        this.base = b;
    }

    public void setAltura(double a){
        this.altura = a;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public double area(){
        this.area = (base * altura) / 2;
        return area;
    }

    @Override
    public String toString(){
        return """
               === DADOS DO TRIANGULO === 
               Valor da Base: """ + base + "\n" + 
                "Valor do Altura: " + altura + "\n" +
                "Valor da Area: " + area() + "\n" +
                "Cor: " + cor;
    }
}
