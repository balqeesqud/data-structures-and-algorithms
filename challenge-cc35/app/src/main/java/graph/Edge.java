package graph;

import java.util.HashMap;
import java.util.Map;

public class Edge {
    private String vertex1;
    private String vertex2;
    private Integer weight;

    public Edge(String vertex1, String vertex2, Integer weight) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> edgeMap = new HashMap<>();
        edgeMap.put("vertex1", vertex1);
        edgeMap.put("vertex2", vertex2);
        edgeMap.put("weight", weight);
        return edgeMap;
    }

    public String getOtherVertex(String currentVertex) {
        if (currentVertex.equals(vertex1)) {
            return vertex2;
        } else if (currentVertex.equals(vertex2)) {
            return vertex1;
        } else {
            throw new IllegalArgumentException("Vertex not part of this edge");
        }
    }

    public Integer getWeight() {
        return weight;
    }
}
