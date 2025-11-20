    class No{
        String nome;
        No proximo;

        No(String nm){
            this.nome = nm;
            this.proximo = null;
        }
    }

    class FilaAtendimento{
        private No inicio;
        private No fim;

        public boolean isEmpty(){
            return inicio == null;
        }

        public void incluir(String nm){
            No novoCliente = new No(nm);

            if (isEmpty()) {
                inicio = novoCliente;
                fim = novoCliente;
            }else{
                fim.proximo = novoCliente;
                fim = novoCliente;
            }
            System.out.println("=== CLIENTE INCLUIDO! ===");
            System.out.println("\nNome: " + novoCliente.nome);
            System.out.println();
        }

        public void listar(){
            System.out.println("\n=== FILA DE CLIENTES ===");
            if (isEmpty()) {
                System.out.println("\nNão há clientes na fila...");
                return;
            }

            No atual = inicio;
            while(atual != null){
                System.out.println("\nNome: " + atual.nome);

                if(atual.proximo != null) System.out.print(" -> ");
                atual = atual.proximo;
            }
            System.err.println();
        }

        public void excluir(){
            System.out.println("=== ATENDIMENTO === ");
            if (isEmpty()) {
                System.out.println("\nNão há clientes na fila no momento...");
            }else{
                System.out.printf("\nCliente %s foi atendido...\n", inicio.nome);
            }
        }
    }

    public class Main{
        public static void main(String[] args) {
            FilaAtendimento fila = new FilaAtendimento();

            fila.incluir("Guilherme");
            fila.incluir("Gabriel");
            fila.incluir("Hugo");
            fila.incluir("Paulo");
            fila.listar();

            fila.excluir();
            fila.listar();

        }
    }