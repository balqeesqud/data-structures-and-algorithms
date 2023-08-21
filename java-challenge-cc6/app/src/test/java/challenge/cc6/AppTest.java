package challenge.cc6;

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
}


