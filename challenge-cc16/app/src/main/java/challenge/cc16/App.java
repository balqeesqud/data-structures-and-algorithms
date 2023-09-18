
package challenge.cc16;

import DataStructures.tree.BinaryTree;
import DataStructures.tree.Node;

public class App {


    public static void main(String[] args) {

        Node root = new Node(10);

        root.setLeft(new Node(5));
        root.setRight(new Node(20));
        root.getLeft().setLeft(new Node(3));
        root.getLeft().setRight(new Node(8));
        root.getRight().setLeft(new Node(15));
        root.getRight().setRight(new Node(25));


        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(root);

        int maxValue = binaryTree.findMaximumValue();

        System.out.println("Maximum value in the tree: " + maxValue);
    }
}

