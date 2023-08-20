import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void testInstantiateEmptyLinkedList() {
        LinkedList list = new LinkedList();
        assertNull(list.head);
    }

    @Test
    public void testInsertIntoLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(10);
        assertNotNull(list.head);
        assertEquals(10, list.head.value);
    }

    @Test
    public void testHeadPropertyPointsToFirstNode() {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(7);
        assertEquals(7, list.head.value);
    }

    @Test
    public void testInsertMultipleNodes() {
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(6);
        list.insert(9);
        assertEquals(9, list.head.value);
    }

    @Test
    public void testFindingExistingValue() {
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(4);
        list.insert(6);
        assertTrue(list.includes(4));
    }

    @Test
    public void testFindingNonExistingValue() {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(3);
        list.insert(5);
        assertFalse(list.includes(2));
    }

    @Test
    public void testReturnAllValues() {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        assertEquals("{ 3 } -> { 2 } -> { 1 } -> NULL", list.toString());
    }
}

    
}
