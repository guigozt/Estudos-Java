import java.util.*;

class Aresta {
    String destino;
    double peso; // distância em km

    public Aresta(String destino, double peso) {
        this.destino = destino;
        this.peso = peso;
    }
}

public class GrafoTuristicoSP_Ponderado {

    private Map<String, List<Aresta>> adjacencia;

    public GrafoTuristicoSP_Ponderado() {
        adjacencia = new HashMap<>();
    }

    public void adicionarVertice(String vertice) {
        adjacencia.putIfAbsent(vertice, new ArrayList<>());
    }

    public void adicionarAresta(String origem, String destino, double peso) {
        adjacencia.get(origem).add(new Aresta(destino, peso));
        adjacencia.get(destino).add(new Aresta(origem, peso)); // não direcionado
    }

    public void mostrarListaAdjacencia() {
        System.out.println("=== LISTA DE ADJACÊNCIA (com distâncias em km) ===");
        for (String vertice : adjacencia.keySet()) {
            System.out.print(vertice + " -> ");
            for (Aresta a : adjacencia.get(vertice)) {
                System.out.print(a.destino + "(" + a.peso + " km) ");
            }
            System.out.println();
        }
    }

    public void mostrarArestas() {
        System.out.println("\n=== ARESTAS DO GRAFO ===");
        Set<String> exibidas = new HashSet<>();
        for (String v : adjacencia.keySet()) {
            for (Aresta a : adjacencia.get(v)) {
                String aresta = v + "-" + a.destino;
                String reversa = a.destino + "-" + v;
                if (!exibidas.contains(reversa)) {
                    System.out.println(v + " — " + a.destino + " : " + a.peso + " km");
                    exibidas.add(aresta);
                }
            }
        }
    }

    public static void main(String[] args) {
        GrafoTuristicoSP_Ponderado grafo = new GrafoTuristicoSP_Ponderado();

        // Pontos turísticos
        String[] pontos = {
                "Avenida Paulista",
                "MASP",
                "Parque Ibirapuera",
                "Catedral da Sé",
                "Mercado Municipal",
                "Pinacoteca",
                "São Bento",
                "Beco do Batman",
                "Farol Santander"
        };

        for (String p : pontos)
            grafo.adicionarVertice(p);

        // Arestas com distâncias aproximadas em km
        grafo.adicionarAresta("Avenida Paulista", "MASP", 0.3);
        grafo.adicionarAresta("Avenida Paulista", "Parque Ibirapuera", 2.0);
        grafo.adicionarAresta("Avenida Paulista", "Beco do Batman", 3.0);
        grafo.adicionarAresta("MASP", "Parque Ibirapuera", 1.7);
        grafo.adicionarAresta("Catedral da Sé", "Mercado Municipal", 1.0);
        grafo.adicionarAresta("Catedral da Sé", "Farol Santander", 0.8);
        grafo.adicionarAresta("Mercado Municipal", "Pinacoteca", 0.7);
        grafo.adicionarAresta("Pinacoteca", "São Bento", 0.4);
        grafo.adicionarAresta("São Bento", "Farol Santander", 0.5);
        grafo.adicionarAresta("Farol Santander", "Mercado Municipal", 0.6);

        // Mostra resultados
        grafo.mostrarListaAdjacencia();
        grafo.mostrarArestas();
    }
}
