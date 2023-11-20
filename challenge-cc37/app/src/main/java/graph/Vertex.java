package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String value;

    public Vertex(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value=" + value +
                '}';
    }
}
