public class Main {

    abstract static class Forma {
        public abstract void desenhar();
    }

    static class Circulo extends Forma {
        @Override
        public void desenhar() {
            System.out.println("Desenhando um círculo...");
        }
    }

    static class Quadrado extends Forma {
        @Override
        public void desenhar() {
            System.out.println("Desenhando um quadrado...");
        }
    }

    static class Triangulo extends Forma {
        @Override
        public void desenhar() {
            System.out.println("Desenhando um triângulo...");
        }
    }

    public static void main(String[] args) {
        Forma[] formas = {
            new Circulo(),
            new Quadrado(),
            new Triangulo()
        };

        for (Forma f : formas) {
            f.desenhar();
        }
    }
}
