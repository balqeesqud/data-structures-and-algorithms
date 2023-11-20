package challenge.cc36;

import graph.Graph;
import graph.Node;
import graph.Vertex;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a graph
        Graph graph = new Graph();

        Vertex vertexA = graph.addVertex(1);
        Vertex vertexB = graph.addVertex(2);
        Vertex vertexC = graph.addVertex(3);

        graph.addEdge(vertexA, vertexB, 5);
        graph.addEdge(vertexA, vertexC, 3);

        System.out.println("Vertices: " + graph.getVertices());
        System.out.println("Neighbors of vertexA: " + graph.getNeighbors(vertexA));
        System.out.println("Graph Size: " + graph.size());

        Vertex startVertex = vertexA;
        graph.breadthFirst(startVertex);
    }

}
