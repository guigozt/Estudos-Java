package P1;
public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 3, "Azul");
        Quadrado quadrado = new Quadrado(4, "Verde");
        Triangulo triangulo = new Triangulo(6, 2, "Amarelo");
        Circulo circulo = new Circulo(3, "Vermelho");

        retangulo.toString();
        quadrado.toString();
        triangulo.toString();
        circulo.toString();
    }
}
