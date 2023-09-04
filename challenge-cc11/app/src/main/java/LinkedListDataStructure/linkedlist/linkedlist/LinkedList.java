//package LinkedListDataStructure.linkedlist.linkedlist;
//
//public class LinkedList {
//    public LinkedListDataStructure.linkedlist.Node head; // Head property
//
//    public LinkedList() {
//        this.head = null; // An empty Linked List upon instantiation
//    }
//
//    // Method to insert a new node at the head
//    public void insert(int value) {
//        LinkedListDataStructure.linkedlist.Node newNode = new LinkedListDataStructure.linkedlist.Node(value);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    // Method to check if a value exists in the Linked List
//    public boolean includes(int value) {
//        LinkedListDataStructure.linkedlist.Node current = head;
//        while (current != null) {
//            if (current.value == value) {
//                return true;
//            }
//            current = current.next;
//        }
//        return false;
//    }
//
//    // Method to convert the Linked List to a formatted string
//    public String toString() {
//        String result = "";
//        LinkedListDataStructure.linkedlist.Node current = head;
//        while (current != null) {
//            result += "{ " + current.value + " } -> ";
//            current = current.next;
//        }
//        result += "NULL";
//        return result;
//    }
//
//    public void append(int newValue) {
//        LinkedListDataStructure.linkedlist.Node newNode = new LinkedListDataStructure.linkedlist.Node(newValue);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        LinkedListDataStructure.linkedlist.Node current = head;
//        while (current.next != null) {
//            current = current.next;
//        }
//        current.next = newNode;
//    }
//
//    public void insertBefore(int value, int newValue) {
//        LinkedListDataStructure.linkedlist.Node newNode = new LinkedListDataStructure.linkedlist.Node(newValue);
//        if (head == null) {
//            return;
//        }
//        if (head.value == value) {
//            newNode.next = head;
//            head = newNode;
//            return;
//        }
//        LinkedListDataStructure.linkedlist.Node current = head;
//        while (current.next != null && current.next.value != value) {
//            current = current.next;
//        }
//        if (current.next != null) {
//            newNode.next = current.next;
//            current.next = newNode;
//        }
//    }
//    public void insertAfter(int value, int newValue) {
//        LinkedListDataStructure.linkedlist.Node newNode = new LinkedListDataStructure.linkedlist.Node(newValue);
//        if (head == null) {
//            return;
//        }
//        LinkedListDataStructure.linkedlist.Node current = head;
//        while (current != null && current.value != value) {
//            current = current.next;
//        }
//        if (current != null) {
//            newNode.next = current.next;
//            current.next = newNode;
//        }
//    }
//
//    //========================================================
//    public int kthFromEnd(int k) {
//        if (head == null || k < 0) {
//            throw new IllegalArgumentException("Invalid input");
//        }
//
//        LinkedListDataStructure.linkedlist.Node forward = head;
//        LinkedListDataStructure.linkedlist.Node backward = head;
//
//        // Moving 'forward' pointer k nodes ahead
//        for (int i = 0; i <= k; i++) {
//            if (forward == null) {
//                throw new IllegalArgumentException("Value of k is greater than the length of the list");
//            }
//            forward = forward.next;
//        }
//
//        // Moving both pointers until 'forward' reaches the end
//        while (forward!= null) {
//            forward = forward.next;
//            backward = backward.next;
//        }
//
//        // 'backward' is now k nodes from the end
//        return backward.value;
//
//
//    }
//    //===========================================================
//
//    public static LinkedList zipLists(LinkedList list1, LinkedList list2) {
//        LinkedList zippedList = new LinkedList();
//        LinkedListDataStructure.linkedlist.Node current1 = list1.head;
//        Node current2 = list2.head;
//
//        while (current1 != null && current2 != null) {
//            zippedList.append(current1.value);
//            zippedList.append(current2.value);
//
//            current1 = current1.next;
//            current2 = current2.next;
//        }
//
//        // Appending the remaining nodes from list1 or list2
//        while (current1 != null) {
//            zippedList.append(current1.value);
//            current1 = current1.next;
//        }
//        while (current2 != null) {
//            zippedList.append(current2.value);
//            current2 = current2.next;
//        }
//
//        return zippedList;
//    }
//}
//
//
