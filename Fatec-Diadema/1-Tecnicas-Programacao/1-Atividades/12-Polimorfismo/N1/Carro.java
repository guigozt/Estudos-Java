public class Carro extends Transporte{
    @Override
    public void mover(){
        System.out.println(getClass().getSimpleName() + " se movendo em 4 rodas!");
    }
}
