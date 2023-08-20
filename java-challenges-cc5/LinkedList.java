import org.w3c.dom.Node;

public class LinkedList {
    private Node head; // The head property points to the first Node in the list

    public LinkedList() {
        this.head = null; // Initialize an empty linked list with no head
    }

    public void insert(int value) {
        Node newNode = new Node (value); // Create a new Node with the given value
        newNode.nextNode = head; // Make the new Node point to the current head
        head = newNode; // Set the new Node as the new head
    }

    public boolean includes(int value) {
        Node current = head; // Start from the head
        while (current != null) {
            if (current.value == value) {
                return true; // Found the value
            }
            current = current.nextNode; // Move to the next Node
        }
        return false; // Value not found
    }

    public String toString() {
        String result = "";
        Node current = head;
        while (current != null) {
            result += "{ " + current.value + " } -> ";
            current = current.nextNode;
        }
        result += "NULL";
        return result;
    }
}
