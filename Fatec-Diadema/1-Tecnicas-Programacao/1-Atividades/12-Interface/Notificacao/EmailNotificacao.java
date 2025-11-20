class EmailNotificacao implements Notificavel{
    @Override
    public void enviarNotificacao(String msg){
        System.out.println("\nMENSAGEM ENVIADA POR EMAIL...\n");
        System.out.println("Mensagem: '" + msg + "'");
    }
}