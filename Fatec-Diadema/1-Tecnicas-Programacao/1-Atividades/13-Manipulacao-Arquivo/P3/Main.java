
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("arquivo.txt"));
            String linha;

            while((linha = leitor.readLine()) != null){
                System.out.println(linha);
            }
            leitor.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo...");
        }
    }
}
