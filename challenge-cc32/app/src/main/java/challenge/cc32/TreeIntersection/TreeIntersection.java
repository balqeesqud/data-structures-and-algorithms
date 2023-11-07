package challenge.cc32.TreeIntersection;


import java.util.HashSet;
import java.util.Set;

public class TreeIntersection {
    public static Set<Integer> tree_intersection(BinaryTree tree1, BinaryTree tree2) {
        Set<Integer> commonValues = new HashSet<>();

        // Create HashSets to store the values of each tree
        Set<Integer> valuesTree1 = new HashSet<>();
        Set<Integer> valuesTree2 = new HashSet<>();

        // Populate the value sets from the trees
        populateValueSet(tree1.getRoot(), valuesTree1);
        populateValueSet(tree2.getRoot(), valuesTree2);

        // Find common values
        for (Integer value : valuesTree1) {
            if (valuesTree2.contains(value)) {
                commonValues.add(value);
            }
        }

        return commonValues;
    }

    // used to traverse a binary tree and populate a Set (in this case, a Set<Integer>) with the unique values found in
    // the tree. It's a recursive method that starts at the root of the tree and explores the left and right subtrees.
    public static void populateValueSet(Node node, Set<Integer> valueSet) {
        if (node == null) {
            return;
        }

        valueSet.add(node.getValue());

        populateValueSet(node.getLeft(), valueSet);
        populateValueSet(node.getRight(), valueSet);
    }

}