import java.util.Scanner;

class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean control = true;

        while (control) { 
            System.out.println("\nQUAL FORMA VOCÊ QUER ENVIAR A MENSAGEM?");
            System.out.println("[1] Email");
            System.out.println("[2] SMS");
            System.out.print("Digite sua opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao != 1 && opcao != 2){
                System.out.println("\nEntrada inválida...");
                continue;
            }

            System.out.print("\nEscreva a mensagem: ");
            String mensagem = sc.nextLine();

            Notificavel notificacao;

            switch (opcao) {
                case 1 -> notificacao = new EmailNotificacao();
                case 2 -> notificacao = new SMSNotificacao();
                default -> {
                    System.out.println("\nOpção inválida!");
                    continue;
                }
            }

            notificacao.enviarNotificacao(mensagem);
            
            System.out.print("\nQuer enviar outra mensagem? (S/N): ");
            String resposta = sc.next().toUpperCase();

            if(!resposta.equalsIgnoreCase("S")){
                control = false;
            }
        }

        sc.close();
    }
}