public class Caminhao extends Veiculo{
    @Override
    public void acelerar(){
        System.out.println(getClass().getSimpleName() + " acelarando devagar com carga pesada até 50 km/h");
    }
}
