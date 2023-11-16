package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<String, Vertex> vertices;

    public Graph() {
        this.vertices = new HashMap<>();
    }

    public Vertex addVertex(String value) {
        Vertex vertex = new Vertex(value);
        vertices.put(value, vertex);
        return vertex;
    }

    public void addEdge(String vertex1, String vertex2, Integer weight) {
        if (!vertices.containsKey(vertex1) || !vertices.containsKey(vertex2)) {
            throw new IllegalArgumentException("Both vertices should already be in the graph.");
        }

        Edge edge = new Edge(vertex1, vertex2, weight);

        vertices.get(vertex1).edges.add(edge);

        if (!vertex1.equals(vertex2)) {
            vertices.get(vertex2).edges.add(new Edge(vertex2, vertex1, weight));
        }
    }


        public List<String> getVertices() {
        return new ArrayList<>(vertices.keySet());
    }

    public List<Map<String, Object>> getNeighbors(String vertex) {
        if (vertices.containsKey(vertex)) {
            List<Map<String, Object>> neighbors = new ArrayList<>();
            for (Edge edge : vertices.get(vertex).edges) {
                Map<String, Object> neighborInfo = new HashMap<>();
                neighborInfo.put("vertex", edge.getOtherVertex(vertex)); // Use a method to get the other vertex
                neighborInfo.put("weight", edge.getWeight());
                neighbors.add(neighborInfo);
            }
            return neighbors;
        } else {
            return new ArrayList<>();
        }
    }


    public int size() {
        return vertices.size();
    }
}
