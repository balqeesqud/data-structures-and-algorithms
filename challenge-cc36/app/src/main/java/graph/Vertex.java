package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    int value;

    public Vertex(int value) {
        this.value = value;
    }


        @Override
        public String toString() {
            return "Vertex{" +
                    "value=" + value +
                    '}';
        }
}
