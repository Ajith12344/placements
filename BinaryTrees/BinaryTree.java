package BinaryTrees;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    BinaryTree() {
        root = null;
    }

    // Postorder traversal: left, right, root
    void printPostorder(TreeNode node) {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.val + " ");
    }

    // Inorder traversal: left, root, right
    void printInorder(TreeNode node) {
        if (node == null)
            return;

        // first recur on left child
        printInorder(node.left);

        // then print the data of node
        System.out.print(node.val + " ");

        // now recur on right child
        printInorder(node.right);
    }

    // Preorder traversal: root, left, right
    void printPreorder(TreeNode node) {
        if (node == null)
            return;

        // first print data of node
        System.out.print(node.val + " ");

        // then recur on left subtree
        printPreorder(node.left);

        // now recur on right subtree
        printPreorder(node.right);
    }

    // Wrappers over above recursive functions
    void printPostorder() {
        printPostorder(root);
    }

    void printInorder() {
        printInorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }
}
