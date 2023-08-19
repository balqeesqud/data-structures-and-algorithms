package LinkedListDataStructire.java;

public class LinkedList {
    private Node head; // Head property

    public LinkedList() {
        this.head = null; // An empty Linked List upon instantiation 
    }

    // Method to insert a new node at the head
    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.nextNode = head;
        head = newNode;
    }

    // Method to check if a value exists in the Linked List
    public boolean includes(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.nextNode;
        }
        return false;
    }

    // Method to convert the Linked List to a formatted string
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

    // public static void main(String[] args) {
    //     LinkedList list = new LinkedList();
    //     list.insert(3);
    //     list.insert(2);
    //     list.insert(1);
        
    //     System.out.println("Linked List: " + list.toString());

    //     System.out.println("Includes 2: " + list.includes(2));
    //     System.out.println("Includes 4: " + list.includes(4));
    // }

