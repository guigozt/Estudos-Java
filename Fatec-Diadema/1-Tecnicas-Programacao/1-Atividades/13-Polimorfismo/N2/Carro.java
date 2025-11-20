public class Carro extends Veiculo{
    @Override
    public void acelerar(){
        System.out.println(getClass().getSimpleName() + " acelarando suavemente até 80 km/h");
    }
}
