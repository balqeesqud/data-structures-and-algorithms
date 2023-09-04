package LinkedListDataStructure.linkedlist.queue;

import LinkedListDataStructure.linkedlist.stack.Stack;

public class PseudoQueue<T> {
    private Stack<T> inbox;  // First stack for enqueue operations
    private Stack<T> outbox; // Second stack for dequeue operations

    public PseudoQueue() {
        inbox = new Stack<>();
        outbox = new Stack<>();
    }

    // Enqueue method to insert a value into the PseudoQueue
    public void enqueue(T value) {
        inbox.push(value);
    }

    // Dequeue method to extract a value from the PseudoQueue
    public T dequeue() {
        if (outbox.isEmpty()) {
            // Transfer elements from inbox to outbox if outbox is empty
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }

        if (outbox.isEmpty()) {
            throw new IllegalStateException("Cannot dequeue from an empty PseudoQueue");
        }

        return outbox.pop();
    }

    public boolean isEmpty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }

    @Override
    public String toString() {
        return "PseudoQueue{" +
                "inbox=" + inbox +
                ", outbox=" + outbox +
                '}';
    }
}