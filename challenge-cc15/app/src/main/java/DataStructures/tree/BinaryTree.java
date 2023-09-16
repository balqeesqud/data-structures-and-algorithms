package DataStructures.tree;


import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;

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
}