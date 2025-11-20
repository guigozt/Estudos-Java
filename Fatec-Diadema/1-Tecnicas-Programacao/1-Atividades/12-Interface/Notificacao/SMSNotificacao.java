class SMSNotificacao implements Notificavel{
    @Override
    public void enviarNotificacao(String msg){
        System.out.println("\nMENSAGEM ENVIADA POR SMS...\n");
        System.out.println("Mensagem: '" + msg + "'");
    }
}