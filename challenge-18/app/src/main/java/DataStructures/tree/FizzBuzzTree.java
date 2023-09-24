package DataStructures.tree;

public class FizzBuzzTree {
    public static TreeNode fizzBuzzTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        fizzBuzz(root);

        for (TreeNode child : root.getChildren()) {
            fizzBuzzTree(child);
        }

        return root;
    }

    private static void fizzBuzz(TreeNode node) {
        int value = Integer.parseInt(node.getValue());

        if (value % 3 == 0 && value % 5 == 0) {
            node.setValue("FizzBuzz");
        } else if (value % 3 == 0) {
            node.setValue("Fizz");
        } else if (value % 5 == 0) {
            node.setValue("Buzz");
        }
    }
}