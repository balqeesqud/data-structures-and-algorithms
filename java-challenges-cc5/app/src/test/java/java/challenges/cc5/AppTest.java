/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java.challenges.cc5;

import LinkedListDataStructire.java.LinkedList;
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
}
