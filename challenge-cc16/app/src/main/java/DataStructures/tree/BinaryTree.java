package DataStructures.tree;


import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public BinaryTree() {
        this.root = null;
    }

    public List<Integer> preorder() {
        List<Integer> result = new ArrayList<>();
        preorderTraversal(root, result);
        return result;
    }

    private void preorderTraversal(Node node, List<Integer> result) {
        if (node != null) {
            result.add(node.value);
            preorderTraversal(node.left, result);
            preorderTraversal(node.right, result);
        }
    }

    public List<Integer> inorder() {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    private void inorderTraversal(Node node, List<Integer> result) {
        if (node != null) {
            inorderTraversal(node.left, result);
            result.add(node.value);
            inorderTraversal(node.right, result);
        }
    }

    public List<Integer> postorder() {
        List<Integer> result = new ArrayList<>();
        postorderTraversal(root, result);
        return result;
    }

    private void postorderTraversal(Node node, List<Integer> result) {
        if (node != null) {
            postorderTraversal(node.left, result);
            postorderTraversal(node.right, result);
            result.add(node.value);
        }
    }

    public int findMaximumValue() {
        return findMaximumValue(root); // Assuming 'root' is the root node of your binary tree
    }

    private int findMaximumValue(Node node) {
        if (node == null) {
            // If the tree is empty, return a suitable default value using integer min-value
            return Integer.MIN_VALUE;
        }

        int currentValue = node.getValue();
        int leftMax = findMaximumValue(node.getLeft());   // Recursively find max in left subtree
        int rightMax = findMaximumValue(node.getRight()); // Recursively find max in right subtree

        // Comparing the current value with the maximum values from left and right subtrees
        return Math.max(currentValue, Math.max(leftMax, rightMax));
    }

}