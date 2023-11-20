package graph;

import java.util.*;

public class Graph {
    public static Integer businessTrip(HashMap<String, HashMap<String, Integer>> graph, String[] trip) {
        if (trip.length <= 1) {
            return 0;
        }

        int totalCost = 0;

        for (int i = 0; i < trip.length - 1; i++) {
            String currentCity = trip[i];
            String nextCity = trip[i + 1];

            if (graph.containsKey(currentCity) && graph.get(currentCity).containsKey(nextCity)) {
                totalCost += graph.get(currentCity).get(nextCity);
            } else {
                return null;
            }
        }
        return totalCost;
    }
}
