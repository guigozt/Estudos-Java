import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File arquivo = new File("arquivo.txt");
            if(arquivo.createNewFile()){
                System.out.println("Arquivo criado com sucesso!");
            }else{
                System.out.println("O arquivo já existe...");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo...");
        }
    }
}
