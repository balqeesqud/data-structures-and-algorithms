package graph;

import java.util.*;

public class Graph {
    private Map<Vertex, List<Edge>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public Vertex addVertex(int value) {
        Vertex vertex = new Vertex(value);
        adjacencyList.put(vertex, new ArrayList<>());
        return vertex;
    }

    public void addEdge(Vertex source, Vertex destination, int weight) {
        if (!adjacencyList.containsKey(source) || !adjacencyList.containsKey(destination)) {
            throw new IllegalArgumentException("Both vertices should already be in the Graph.");
        }

        Edge edge = new Edge(source, destination, weight);
        adjacencyList.get(source).add(edge);
    }

    public Collection<Vertex> getVertices() {
        return adjacencyList.keySet();
    }
    public Collection<Edge> getNeighbors(Vertex vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            return Collections.emptyList();
        }
        return adjacencyList.get(vertex);
    }
    public int size() {
        return adjacencyList.size();
    }
    public Collection<Vertex> breadthFirst(Vertex startVertex) {
        if (!adjacencyList.containsKey(startVertex)) {
            throw new IllegalArgumentException("Start vertex should be in the Graph.");
        }

        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        List<Vertex> result = new ArrayList<>();

        queue.add(startVertex);
        visited.add(startVertex);

        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            result.add(currentVertex);

            List<Edge> neighbors = adjacencyList.get(currentVertex);
            if (neighbors != null) {
                for (Edge edge : neighbors) {
                    Vertex neighbor = edge.destination;
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }

        displayCollection(result);
        return result;
    }
    private void displayCollection(Collection<Vertex> vertices) {
        System.out.println("Breadth-First Traversal:");
        for (Vertex vertex : vertices) {
            System.out.print(vertex + " ");
        }
        System.out.println();
    }
}
