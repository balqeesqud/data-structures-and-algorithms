package LinkedListDataStructure.linkedlist.stack;



public class Stack <T>{
    Node<T> top;

public Stack(){
    this.top = null; // instantiated an empty linkedlist
        }

public void push(T value) {
    Node<T> newNode = new Node<>(value);
    newNode.next = top;
    top = newNode;
}

public boolean isEmpty() {
    if (top == null)
        return true;
    else
        return false;
}

public T pop() {
    if (isEmpty()) {
        throw new IllegalStateException("Cannot pop from an empty stack");
    } else {
        T poppedValue = top.value;  // value that will be removed from the stack and returned stored in poopedValue
        top = top.next; // the top node will move to the previous node in order to remove the top value.
        return poppedValue;
    }
}

    public T peek() {
        if(top==null){
            throw new IllegalArgumentException("Stack is Empty");
        }else{
            return top.value;
        }
    }


//    pop
//
//    Arguments: none
//    Returns: the value from node from the top of the stack
//    Removes the node from the top of the stack
//    Should raise exception when called on empty stack
//


    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}


