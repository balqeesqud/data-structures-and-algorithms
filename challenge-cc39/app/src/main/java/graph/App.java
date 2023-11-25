package graph;

import graph.Graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static graph.Graph.isConnected;

public class App {
    public static void main(String[] args) {
        Map<Character, List<Character>> adjacencyList = new HashMap<>();
        adjacencyList.put('a', Arrays.asList('b', 'c'));
        adjacencyList.put('b', Arrays.asList('d', 'a'));
        adjacencyList.put('c', Arrays.asList('a', 'd'));
        adjacencyList.put('d', Arrays.asList('b', 'c', 'f'));
        adjacencyList.put('e', Arrays.asList('f'));
        adjacencyList.put('f', Arrays.asList('e', 'g'));
        adjacencyList.put('g', Arrays.asList('f'));

        char startNode = 'd';
        char endNode = 'g';

        boolean isConnected = isConnected(adjacencyList, startNode, endNode);
        System.out.println("The path between D & G is:" + isConnected);
    }
}

