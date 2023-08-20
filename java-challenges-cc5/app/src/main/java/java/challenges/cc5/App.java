

import LinkedListDataStructire.java.LinkedList;

public class App {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(3);
        list.insert(7);
        list.insert(10);

        System.out.println("Linked List: " + list.toString());
    
        System.out.println("Value 7 exists in the list: " + list.includes(7));
        System.out.println("Value 5 exists in the list: " + list.includes(5));
     
    }
}
