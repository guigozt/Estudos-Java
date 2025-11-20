public class Moto extends Veiculo{
    @Override
    public void acelerar(){
        System.out.println(getClass().getSimpleName() + " acelerando rápido até 100 km/h");
    }
}
