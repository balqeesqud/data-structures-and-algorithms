package LinkedListDataStructure.linkedlist.stack;

public class Node<T>{
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}