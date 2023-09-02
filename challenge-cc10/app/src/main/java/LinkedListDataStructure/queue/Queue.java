package LinkedListDataStructure.queue;

public class Queue {
    Node front;
    Node back;

    public Queue() {
        this.front = null;
        this.back = null;
    }

   public boolean isEmpty(){
        if(front==null)
            return true;
        else
            return false;
   }

   public void enqueue(int value){
   Node newNode = new Node(value);
       if (isEmpty()) {
           // If the queue is empty, set both front and rear to the new node
           front = back = newNode;
       }else {
           back.next = newNode;
           back = newNode;
       }
   }

    public int dequeue( ){
        if(isEmpty()){
        throw new IllegalArgumentException("Queue is Empty");
        }else {
            int dequeuedValue = front.value;
            front = front.next;

            if (front == null) {
                // If front becomes null after dequeue, the queue is now empty, so I updated the back as well
                back = null;
            }

            return dequeuedValue;
        }
            }


    public int peek(){
        if (front==null) // isEmpty()
            throw new IllegalArgumentException("Queue is Empty");
        else
        return front.value;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                '}';
    }
}