/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge.cc35;

import graph.Graph;
import graph.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private Graph graph;

    @BeforeEach
    public void setUp() {
        graph = new Graph();
    }

    @Test
    public void testAddVertex() {
        Vertex vertex = graph.addVertex("A");
        assertEquals("A", vertex.getValue());
    }
    @Test
    public void testAddEdge() {
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addEdge("A", "B", 2);
        assertEquals(1, graph.getNeighbors("A").size());
        assertEquals(1, graph.getNeighbors("B").size());
    }

    @Test
    public void testGetVertices() {
        graph.addVertex("A");
        graph.addVertex("B");
        assertEquals(2, graph.getVertices().size());
    }

    @Test
    void testGetNeighborsWithWeight() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addEdge("A", "B", 2);
        List<Map<String, Object>> neighbors = graph.getNeighbors("A");
        assertEquals(1, neighbors.size());
        assertEquals("B", neighbors.get(0).get("vertex"));
        assertEquals(2, neighbors.get(0).get("weight"));
    }

    @Test
    public void testSize() {
        graph.addVertex("A");
        graph.addVertex("B");
        assertEquals(2, graph.size());
    }

    @Test
    void testSingleVertexAndEdge() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addEdge("A", "A", 1);
        assertEquals(1, graph.size());
        List<Map<String, Object>> neighbors = graph.getNeighbors("A");
        assertEquals(1, neighbors.size());
        assertEquals("A", neighbors.get(0).get("vertex"));
        assertEquals(1, neighbors.get(0).get("weight"));
    }

}
