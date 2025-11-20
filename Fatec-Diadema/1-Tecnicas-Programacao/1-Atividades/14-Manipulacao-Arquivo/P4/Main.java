import java.io.File;

public class Main {
    public static void main(String[] args) {
        File arquivo = new File("arquivo.txt");

        System.out.println("Nome: " + arquivo.getName());
        System.out.println("Caminho: " + arquivo.getAbsolutePath());
        System.out.println("Existe: " + arquivo.exists());
        System.out.println("Tamanho: " + arquivo.length() + " bytes");
        System.out.println("Pode ler: " + arquivo.canRead());
        System.out.println("Pode escrever: " + arquivo.canWrite());
        System.out.println("É diretório: " + arquivo.isDirectory());
        System.out.println("É arquivo: " + arquivo.isFile());
    }
}
