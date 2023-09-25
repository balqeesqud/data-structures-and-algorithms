package DataStructures.tree;


import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
//    Node root;

    FizzBuzzNode root;

    public static class Node {
        int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public String getValue() {
            return String.valueOf(this.value);
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }

    public static class FizzBuzzNode extends Node {
        String value;

        public FizzBuzzNode(String value) {
            super(0);
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public FizzBuzzNode getRoot() {
        return root;
    }


    public BinaryTree() {
        this.root = null;
    }


    public List<String> preOrderTraversal(FizzBuzzNode node) {
        List<String> result = new ArrayList<>();
        if (node != null) {
            result.add(node.getValue());
            result.addAll(preOrderTraversal((FizzBuzzNode) node.left));
            result.addAll(preOrderTraversal((FizzBuzzNode) node.right));
        }
        return result;
    }


    public List<Integer> breadthFirst() {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<FizzBuzzNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            FizzBuzzNode node = queue.poll();
            result.add(Integer.parseInt(node.value));

            if (node.left != null) {
                queue.offer((FizzBuzzNode) node.left);
            }

            if (node.right != null) {
                queue.offer((FizzBuzzNode) node.right);
            }
        }

        return result;
    }
    }
