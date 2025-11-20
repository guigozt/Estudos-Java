public class Aviao extends Transporte {
    @Override
    public void mover(){
        System.out.println(getClass().getSimpleName() + " voando pelos céus");
    }
}
