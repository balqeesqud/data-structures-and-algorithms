
package challenge.cc17;


import DataStructures.tree.Node;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class App {

    public static List<Integer> breadthFirst(Node root){
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // .offer() method is used to add an element to the end of a queue, just like .add().
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        // .add() method is used to add an element to the end of a queue.
        // .poll() method is used to retrieve and remove the head (first element) of a queue.
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.getValue());

            if (current.getLeft() != null) {
                queue.offer(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.offer(current.getRight());
            }
        }

        return result;
    }


    public static void main(String[] args) {

        Node root = new Node(2);
        root.setLeft(new Node(7));
        root.setRight(new Node(5));
        root.getLeft().setLeft(new Node(2));
        root.getLeft().setRight(new Node(6));
        root.getRight().setRight(new Node(9));
        root.getLeft().getRight().setLeft(new Node(5));
        root.getLeft().getRight().setRight(new Node(11));
        root.getRight().getRight().setLeft(new Node(4));

        List<Integer> result = breadthFirst(root);
        System.out.println(result);
    }
}

