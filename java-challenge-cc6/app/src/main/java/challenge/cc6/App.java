package challenge.cc6;


import LinkedListDataStructure.LinkedList;

public class App {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(3);
        list.insert(7);
        list.insert(10);

        System.out.println("Linked List: " + list.toString());

        System.out.println("Value 7 exists in the list: " + list.includes(7));
        System.out.println("Value 5 exists in the list: " + list.includes(5));

        // append
        LinkedList linkedList = new LinkedList();
        linkedList.append(3);
        linkedList.append(7);
        linkedList.append(5);

        System.out.println("After append:" + linkedList);


        // insertBefore

        linkedList.insertBefore(7, 10);
        System.out.println("After insert before 7 :" + linkedList);


        // insertAfter

        linkedList.insertAfter(10, 50);
        System.out.println("After insert after 10:" + linkedList);

    }
}