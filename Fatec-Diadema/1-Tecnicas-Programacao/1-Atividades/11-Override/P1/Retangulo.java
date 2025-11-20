package P1;
public class Retangulo extends Figura{
    private double lado1;
    private double lado2;
    private double area;

    Retangulo(double l1, double l2, String cor){
        super(cor);
        this.lado1 = l1;
        this.lado2 = l2;
    }

    public void setLado1(double l1){
        this.lado1 = l1;
    }

    public void setLado2(double l2){
        this.lado2 = l2;
    }

    public double getLado1(){
        return lado1;
    }

    public double getLado2(){
        return lado2;
    }

    public double area(){
        this.area = lado1 * lado2;
        return area;
    }

    @Override
    public String toString(){
        return """
               === DADOS DO RETANGULO === 
               Valor do Lado 1: """ + lado1 + "\n" + 
                "Valor do Lado 2: " + lado2 + "\n" +
                "Valor da Area: " + area() + "\n" +
                "Cor: " + cor;
    }
}