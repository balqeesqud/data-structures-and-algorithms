package graph;

import java.util.*;

public class Graph {
    List<Node> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public List<Node> depthFirst(Node startNode) {
        List<Node> result = new ArrayList<>();
        Set<Node> visited = new HashSet<>();
        depthFirstHelper(startNode, visited, result);
        return result;
    }

    private void depthFirstHelper(Node node, Set<Node> visited, List<Node> result) {
        if (node == null || visited.contains(node)) {
            return;
        }

        visited.add(node);
        result.add(node);

        for (Node neighbor : node.getNeighbors()) {
            depthFirstHelper(neighbor, visited, result);
        }
    }
}
