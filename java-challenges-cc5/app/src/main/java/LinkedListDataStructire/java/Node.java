package LinkedListDataStructire.java;

public class Node {
    public int value;     // This is where you store the data in the Node
    public Node nextNode; // This is a reference to the next Node

    public Node(int value) {
        this.value = value;  // Set the value when creating a new Node
        this.nextNode = null; // Initially, there's no next Node
    }



}