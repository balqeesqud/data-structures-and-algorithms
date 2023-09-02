package LinkedListDataStructure.queue;

public class Node{
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    @java.lang.Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}