/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge.cc10;

import LinkedListDataStructure.queue.Queue;
import LinkedListDataStructure.stack.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    Queue queue=new Queue();
    Stack stack=new Stack();

    @Test
    public void testPushToStack() {
        stack.push(10);
        assertEquals(10, stack.peek());
    }

    @Test
    public void testPushMultipleValuesToStack() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(30, stack.peek());
    }

    @Test
    public void testPopFromStack() {
        stack.push(10);
        int poppedValue = stack.pop();
        assertEquals(10, poppedValue);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testEmptyStackAfterMultiplePops() {
        stack.push(10);
        stack.push(20);
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeekStack() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.peek());
    }

    @Test
    public void testEmptyStackInstantiation() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPopOnEmptyStackRaisesException() {
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }

    @Test
    public void testPeekOnEmptyStackRaisesException() {
        assertThrows(IllegalArgumentException.class, () -> stack.peek());
    }

    // Queue tests

    @Test
    public void testEnqueueToQueue() {
        queue.enqueue(10);
        assertEquals(10, queue.peek());
    }

    @Test
    public void testEnqueueMultipleValuesToQueue() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertEquals(10, queue.peek());
    }

    @Test
    public void testDequeueFromQueue() {
        queue.enqueue(10);
        int dequeuedValue = queue.dequeue();
        assertEquals(10, dequeuedValue);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeekQueue() {
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(10, queue.peek());
    }

    @Test
    public void testEmptyQueueInstantiation() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testDequeueOnEmptyQueueRaisesException() {
        assertThrows(IllegalArgumentException.class, () -> queue.dequeue());
    }

    @Test
    public void testPeekOnEmptyQueueRaisesException() {
        assertThrows(IllegalArgumentException.class, () -> queue.peek());
    }
}

