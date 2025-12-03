public class Main {
    public static String inverte(String txt){
        if (txt.length() <= 1){
            return txt;
        }

        char primeiro = txt.charAt(0); //Pega o primeiro index de txt
        String resto = txt.substring(1); //Pega o resto da String a partir do index 1

        return inverte(resto) + primeiro; //Junta o resto com as primeiras letras (inverso)
    }

    public static void main(String[] args) {
        String texto = "Fatec";
        System.out.println("String Original: " + texto);
        System.out.println("String Invertida: " + inverte(texto));
    }    
}
