import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter escrita = new FileWriter("arquivo.txt");
            escrita.write("Gravando no arquivo");
            escrita.close();
            System.out.println("Gravação feita com sucesso!");
        }catch(IOException e){
            System.out.println("Erro ao gravar no arquivo");
        }
    }
}
