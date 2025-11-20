class Calculadora{
    public int somar(int a, int b){
        return a + b;
    }

    public double somar(double a, double b){
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public int subtrair(int a, int b){
        return a - b;
    }

    public double subtrair(double a, double b){
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b){
        if(b == 0){
            System.out.println("Impossivel divisão por 0");
            return 0;
        }

        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
           
        System.out.println(calc.somar(10, 20));           // soma int
        System.out.println(calc.somar(10, 20, 30));       // soma 3 ints
        System.out.println(calc.somar(5.5, 2.3));         // soma double

        System.out.println(calc.multiplicar(5, 4));       // multiplicação int
        System.out.println(calc.multiplicar(2.5, 4.0));   // multiplicação double

        System.out.println(calc.subtrair(15, 5));         // subtração
        System.out.println(calc.dividir(10.0, 2.0)); 
    }
}
