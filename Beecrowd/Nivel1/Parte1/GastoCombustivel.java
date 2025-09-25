
import java.util.Scanner;

public class GastoCombustivel{
    public static double quantLitros(int t, int v){
        return (t * v) / 12.0;  
    }
    
	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){
		    int tempo = entrada.nextInt();
		    int velocidade = entrada.nextInt();
		    
		    System.out.printf("%.3f%n", quantLitros(tempo, velocidade));
		}
	}
}