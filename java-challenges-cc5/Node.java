
public class Node {

    public int value;     //  storing data in Node
    public Node nextNode; // reference to the next Node
    
    public Node(int value) {  // constructor 
        this.value = value;  // Set the value when creating a new Node
        this.nextNode = null; // there's no next Node
    }
}
