package challenge.cc12.queue;

public class Node {
    String value;
    Node next;

    public Node (String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
