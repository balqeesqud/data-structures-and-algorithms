package challenge.cc8;


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




        //====================================

        LinkedList ll = new LinkedList();

        ll.append(1);
        ll.append(3);
        ll.append(8);
        ll.append(2);


        System.out.println("Linked list ll = " + ll);
        int k = 2;
        try {
            int result = ll.kthFromEnd(k);
            System.out.println("Value at kth position from end: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        //===========================================
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(2);


        LinkedList list2 = new LinkedList();
        list2.append(5);
        list2.append(9);
        list2.append(4);

        LinkedList zippedList = LinkedList.zipLists(list1, list2);
        System.out.println("The ZippedList:" + zippedList);

    }

}
