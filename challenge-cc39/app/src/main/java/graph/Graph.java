package graph;

import java.util.*;

public class Graph {
    public static boolean isConnected(Map<Character, List<Character>> graph, char startNode, char endNode) {
        Set<Character> visited = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();

        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            char currentNode = queue.poll();

            if (currentNode == endNode) {
                return true;  // Found a connection
            }

            List<Character> neighbors = graph.get(currentNode);
            if (neighbors != null) {
                for (char neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }
        return false;
    }
}
