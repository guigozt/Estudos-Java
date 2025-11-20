public class Bicicleta extends Transporte{
    @Override
    public void mover(){
        System.out.println(getClass().getSimpleName() + " se movimento com 2 rodas!");
    }
}
