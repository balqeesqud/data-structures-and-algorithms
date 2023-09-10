package challenge.cc13;

public class Node {
    char value;
    Node next;

    public Node(char value) {
        this.value = value;
        this.next=null;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}