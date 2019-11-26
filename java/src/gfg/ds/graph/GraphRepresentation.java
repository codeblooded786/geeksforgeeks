package gfg.ds.graph;

import java.util.LinkedList;

public class GraphRepresentation {

    static class Graph {
        int V;
        LinkedList<Integer> adjListArray[];

        public Graph(int v) {
            V = v;
            adjListArray = new LinkedList[v];

            for (int i = 0; i < v; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
    }

    public static void addEdge(Graph graph, int src, int dest) {
        graph.adjListArray[src].add(dest);
        graph.adjListArray[dest].add(src);
    }

    public void printGraph(Graph graph, int v) {
        for (int i = 0; i < v; i++) {
            System.out.print("head");
            for (int j :
                    graph.adjListArray[i]) {

                System.out.print("->" + j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int v = 5;
        Graph graph = new Graph(v);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        new GraphRepresentation().printGraph(graph, v);
    }
}
