package challenge.cc8;

import LinkedListDataStructure.LinkedList;
import LinkedListDataStructure.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testEmptyLinkedList() {
        LinkedList emptyList = new LinkedList();
        assertEquals("NULL", emptyList.toString());
    }

    @Test
    void testInsert() {
        LinkedList list = new LinkedList();
        list.insert(5);
        assertEquals("{ 5 } -> NULL", list.toString());
    }

    @Test
    void testHeadPointsToFirstNode() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        assertEquals("{ 20 } -> { 10 } -> NULL", list.toString());
    }

    @Test
    void testInsertMultipleNodes() {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        assertEquals("{ 3 } -> { 2 } -> { 1 } -> NULL", list.toString());
    }

    @Test
    void testIncludesExistingValue() {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        assertTrue(list.includes(10));
    }

    @Test
    void testIncludesNonExistingValue() {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        assertFalse(list.includes(20));
    }

    @Test
    void testToString() {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        assertEquals("{ 3 } -> { 2 } -> { 1 } -> NULL", list.toString());
    }


    LinkedList linkedList = new LinkedList();

    @Test
    public void testAppendSingleNode() {
        linkedList.append(5);
        assertEquals(5, linkedList.head.value);
        assertNull(linkedList.head.next);
    }

    @Test
    public void testAppendMultipleNodes() {
        linkedList.append(5);
        linkedList.append(10);
        linkedList.append(15);

        Node current = linkedList.head;
        assertEquals(5, current.value);
        current = current.next;
        assertEquals(10, current.value);
        current = current.next;
        assertEquals(15, current.value);
        assertNull(current.next);
    }

    @Test
    public void testInsertBeforeMiddleNode() {
        linkedList.append(5);
        linkedList.append(10);
        linkedList.append(15);

        linkedList.insertBefore(10, 12);

        Node current = linkedList.head;
        assertEquals(5, current.value);
        current = current.next;
        assertEquals(12, current.value);
        current = current.next;
        assertEquals(10, current.value);
        current = current.next;
        assertEquals(15, current.value);
        assertNull(current.next);
    }

    @Test
    public void testInsertBeforeFirstNode() {
        linkedList.append(10);
        linkedList.append(15);

        linkedList.insertBefore(10, 5);

        Node current = linkedList.head;
        assertEquals(5, current.value);
        current = current.next;
        assertEquals(10, current.value);
        current = current.next;
        assertEquals(15, current.value);
        assertNull(current.next);
    }

    @Test
    public void testInsertAfterMiddleNode() {
        linkedList.append(5);
        linkedList.append(10);
        linkedList.append(15);

        linkedList.insertAfter(10, 12);

        Node current = linkedList.head;
        assertEquals(5, current.value);
        current = current.next;
        assertEquals(10, current.value);
        current = current.next;
        assertEquals(12, current.value);
        current = current.next;
        assertEquals(15, current.value);
        assertNull(current.next);
    }

    @Test
    public void testInsertAfterLastNode() {
        linkedList.append(5);
        linkedList.append(10);

        linkedList.insertAfter(10, 15);

        Node current = linkedList.head;
        assertEquals(5, current.value);
        current = current.next;
        assertEquals(10, current.value);
        current = current.next;
        assertEquals(15, current.value);
        assertNull(current.next);
    }

    //===========================================

    @Test
    public void testKGreaterThanListLength() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(3);
        ll.append(8);

        try {
            ll.kthFromEnd(4);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testKEqualsListLength() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(3);
        ll.append(8);

        try {
            ll.kthFromEnd(3);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }


    @Test
    public void testKNegative() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(3);
        ll.append(8);

        try {
            ll.kthFromEnd(-2);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    @Test
    public void testSingleElementList() {
        LinkedList ll = new LinkedList();
        ll.append(5);

        assertEquals(5, ll.kthFromEnd(0));
    }

    @Test
    public void testMiddleElement() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(3);
        ll.append(8);
        ll.append(2);

        assertEquals(3, ll.kthFromEnd(2));
    }

    @Test
    public void testHappyPath() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(3);
        ll.append(8);
        ll.append(2);

        assertEquals(8, ll.kthFromEnd(1));
    }

    @Test
    public void testEqualLengthZipLists() {
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(5);

        LinkedList list2 = new LinkedList();
        list2.append(2);
        list2.append(4);
        list2.append(6);

        LinkedList zippedList = LinkedList.zipLists(list1, list2);

        String expected = "{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> { 6 } -> NULL";
        String actual = zippedList.toString();

        assertEquals(expected, actual);

    }

    @Test
    public void testUnEqualLengthZipListsOne() {

        LinkedList list3 = new LinkedList();
        list3.append(1);
        list3.append(3);

        LinkedList list4 = new LinkedList();
        list4.append(5);
        list4.append(9);
        list4.append(4);

        LinkedList zippedListTwo = LinkedList.zipLists(list3, list4);
        String expectedTwo = "{ 1 } -> { 5 } -> { 3 } -> { 9 } -> { 4 } -> NULL";
        String actualTwo = zippedListTwo.toString();
        assertEquals(expectedTwo, actualTwo);
    }

    @Test
    public void testUnEqualLengthZipListsTwo() {
        LinkedList list5 = new LinkedList();
        list5.append(5);
        list5.append(7);
        list5.append(2);


        LinkedList list6 = new LinkedList();
        list6.append(10);
        list6.append(9);


        LinkedList zippedListTwo = LinkedList.zipLists(list5, list6);
        String expectedTwo = "{ 5 } -> { 10 } -> { 7 } -> { 9 } -> { 2 } -> NULL";
        String actualTwo = zippedListTwo.toString();
        assertEquals(expectedTwo, actualTwo);
    }

    @Test
    public void testOneEmptyZipLengthLists() {
        LinkedList list5 = new LinkedList();



        LinkedList list6 = new LinkedList();
        list6.append(10);
        list6.append(9);


        LinkedList zippedListTwo = LinkedList.zipLists(list5, list6);
        String expectedTwo = "{ 10 } -> { 9 } -> NULL";
        String actualTwo = zippedListTwo.toString();
        assertEquals(expectedTwo, actualTwo);
    }
}


