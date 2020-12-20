package ru.geekbrains.algorithms.lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        graph.addEdge(1,0);
        graph.addEdge(4,5);
        graph.addEdge(4,7);
        graph.addEdge(1,9);
        graph.addEdge(5,6);
        graph.addEdge(7,9);
        graph.addEdge(7,0);
        graph.addEdge(4,9);
        graph.addEdge(8,5);
        graph.addEdge(8,9);
        graph.addEdge(8,7);
        graph.addEdge(8,3);

        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 0);

        System.out.println(bfp.hasPathTo(9));
        System.out.println(bfp.pathTo(9));

    }
}
