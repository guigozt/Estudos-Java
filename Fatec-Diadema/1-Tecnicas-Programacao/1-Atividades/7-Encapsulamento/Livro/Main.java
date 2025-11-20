import java.util.Scanner;

class Livro{
    private String tituloLivro;
    private String autorLivro;
    private int anoPublicacao;
    
    Livro(String titulo, String autor, int anoPubli){
        this.tituloLivro = titulo;
        this.autorLivro = autor;
        this.anoPublicacao = anoPubli;
    }

    public String getTitulo(){
        return tituloLivro;
    }

    public void setTitulo(String titulo){
        this.tituloLivro = titulo;
    }

    public String getAutor(){
        return autorLivro;
    }

    public void setAutor(String autor){
        this.autorLivro = autor;
    }

    public int getAno(){
        return anoPublicacao;
    }

    public void setAno(int ano){
        this.anoPublicacao = ano;
    }

    public void imprimirDados(){
        System.out.println("\n=== Dados sobre o Livro === \n");
        System.out.println("Nome do livro: " + tituloLivro);
        System.out.println("Nome do autor: " + autorLivro);
        System.out.println("Ano de Publicação:  " + anoPublicacao);
        System.out.println("\n");
    }

    public void edicaoDados(Scanner sc){
        System.out.println("Deseja editar algum dado do livro cadastrado?");
        System.out.print("Opção (S/N): ");
        char opcao = sc.next().trim().toUpperCase().charAt(0);
        sc.nextLine(); // limpar buffer

        if (opcao == 'S'){
            System.out.println("Qual campo você deseja editar?");
            System.out.println("Digite [1] para editar o Titulo");
            System.out.println("Digite [2] para editar o Autor");
            System.out.println("Digite [3] para editar o Ano de Publicação");
            System.out.println("Opção: ");
            int opcaoEdicao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch(opcaoEdicao){
                case 1:
                    System.out.print("Informe o novo [Titulo] do Livro: ");
                    String titulo = sc.nextLine();
                    setTitulo(titulo);
                    break;
                case 2:
                    System.out.print("Informe o novo [Autor] do Livro: ");
                    String autor = sc.nextLine();
                    setAutor(autor);
                    break;
                case 3:
                    System.out.print("Informe o novo [Ano de Publicação] do Livro (YYYY): ");
                    int ano = sc.nextInt();
                    setAno(ano);
                    break;
                default:
                    System.out.println("ERRO! opção inválida!");
            }
        }else{
            System.out.println("Nenhum dado alterado!");
        }

        imprimirDados();
    }
}

public class Main{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Informe o [Titulo] do Livro: ");
            String titulo = sc.nextLine();
            System.out.print("Informe o [Autor] do Livro: ");
            String autor = sc.nextLine();
            System.out.print("Informe o [Ano de Publicação] do Livro (YYYY): ");
            int ano = Integer.parseInt(sc.nextLine());

            Livro novoLivro = new Livro(titulo, autor, ano);
            novoLivro.edicaoDados(sc);
        }
    }
}