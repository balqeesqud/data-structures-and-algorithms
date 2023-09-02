package LinkedListDataStructure.stack;



public class Stack{
    Node top;

public Stack(){
    this.top = null; // instantiated an empty linkedlist
        }

public void push(int value) {
    Node newNode = new Node(value);
    newNode.next = top;
    top = newNode;
}

public boolean isEmpty() {
    if (top == null)
        return true;
    else
        return false;
}

public int pop() {
    if (isEmpty()) {
        throw new IllegalStateException("Cannot pop from an empty stack");
    } else {
        int poppedValue = top.value;  // value that will be removed from the stack and returned stored in poopedValue
        top = top.next; // the top node will move to the previous node in order to remove the top value.
        return poppedValue;
    }
}

    public int peek() {
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


