package LinkedListDataStructure.linkedlist.queue;

public class Node<T>{
    T value;
    Node<T> next;

    public Node(T value) {
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