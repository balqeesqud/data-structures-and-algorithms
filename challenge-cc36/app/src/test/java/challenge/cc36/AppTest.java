/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge.cc36;

import graph.Graph;
import graph.Vertex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testGraphSizeAfterAddingEdges() {
        Graph graph = new Graph();
        Vertex vertexA = graph.addVertex(1);
        Vertex vertexB = graph.addVertex(2);

        graph.addEdge(vertexA, vertexB, 4);

        int expectedSize = 2;
        assertEquals(expectedSize, graph.size());
    }
    @Test
    public void testAddVertex() {
        Graph graph = new Graph();
        Vertex vertex = graph.addVertex(1);
        assertTrue(graph.getVertices().contains(vertex));
    }

    @Test
    public void testAddEdge() {
        Graph graph = new Graph();
        Vertex vertexA = graph.addVertex(1);
        Vertex vertexB = graph.addVertex(2);
        graph.addEdge(vertexA, vertexB, 5);
        assertTrue(graph.getNeighbors(vertexA).stream().anyMatch(edge -> edge.getDestination() == vertexB));
    }

    @Test
    public void testGetVertices() {
        Graph graph = new Graph();
        Vertex vertexA = graph.addVertex(1);
        Vertex vertexB = graph.addVertex(2);
        assertTrue(graph.getVertices().contains(vertexA));
        assertTrue(graph.getVertices().contains(vertexB));
    }

    @Test
    public void testGetNeighbors() {
        Graph graph = new Graph();
        Vertex vertexA = graph.addVertex(1);
        Vertex vertexB = graph.addVertex(2);
        graph.addEdge(vertexA, vertexB, 5);
        assertTrue(graph.getNeighbors(vertexA).stream().anyMatch(edge -> edge.getDestination() == vertexB));
    }

    @Test
    public void testGetNeighborsWithWeight() {
        Graph graph = new Graph();
        Vertex vertexA = graph.addVertex(1);
        Vertex vertexB = graph.addVertex(2);
        graph.addEdge(vertexA, vertexB, 5);
        int weight = graph.getNeighbors(vertexA).stream()
                .filter(edge -> edge.getDestination() == vertexB)
                .findFirst()
                .map(edge -> edge.getWeight())
                .orElse(0);
        assertEquals(5, weight);
    }

    @Test
    public void testSize() {
        Graph graph = new Graph();
        Vertex vertexA = graph.addVertex(1);
        Vertex vertexB = graph.addVertex(2);
        assertEquals(2, graph.size());
    }

    @Test
    public void testGraphWithOneVertexAndEdge() {
        Graph graph = new Graph();
        Vertex vertexA = graph.addVertex(1);
        graph.addEdge(vertexA, vertexA, 0); // Self-loop edge with weight 0
        assertEquals(1, graph.size());
        assertTrue(graph.getNeighbors(vertexA).stream().anyMatch(edge -> edge.getDestination() == vertexA && edge.getWeight() == 0));
    }
}
