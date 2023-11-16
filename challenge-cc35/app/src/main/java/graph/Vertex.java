package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Vertex {
    public String value;
    public List<Edge> edges;

    public Vertex(String value) {
        this.value = value;
        this.edges = new ArrayList<>();
    }

    public String getValue() {
        return value;
    }

    public List<Edge> getEdges() {
        return edges;
    }
}
