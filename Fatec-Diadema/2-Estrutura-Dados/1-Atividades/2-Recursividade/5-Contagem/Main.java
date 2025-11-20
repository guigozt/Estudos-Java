public class Main {
    public static int contagem(int cont){
        if(cont == 0){
            System.out.println(cont);
            return cont;
        }
        System.out.println(cont);
        return contagem(cont -1);
    }

    public static void main(String[] args) {
        contagem(5);
    }    
}
