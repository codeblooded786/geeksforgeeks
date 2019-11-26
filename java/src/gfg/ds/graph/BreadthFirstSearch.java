package gfg.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {

    static class Graph {
        int V;
        LinkedList<Integer> adjListArray[];

        public Graph(int v) {
            V = v;
            adjListArray = new LinkedList[v];
            for (int i = 0; i < v; i++)
                adjListArray[i] = new LinkedList<>();
        }
    }

    public static void addEdge(Graph graph, int src, int dest) {
        graph.adjListArray[src].add(dest);
    }

    public static void printGraph(Graph graph, int v) {
        for (int i = 0; i < v; i++) {
            System.out.print("head");
            for (int j :
                    graph.adjListArray[i]) {
                System.out.print("->" + j);
            }
            System.out.println();
        }
    }

    public static void BFS(Graph graph, int src, int v) {
        boolean visited[] = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(src);
        visited[src] = true;

        while (queue.size() != 0) {
            src = queue.poll();
            System.out.print(src + " ");

            Iterator<Integer> i = graph.adjListArray[src].listIterator();

            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        int v = 4;
        Graph g = new Graph(v);
        addEdge(g, 0, 1);
        addEdge(g, 0, 2);
        addEdge(g, 1, 2);
        addEdge(g, 2, 0);
        addEdge(g, 2, 3);
        addEdge(g, 3, 3);
        printGraph(g, v);
        BFS(g, 2, 4);
    }

}
