package BinaryTrees;


public class MaxHeight {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        int height(Node root) {
            if (root == null) {
                return 0; // If height is measured in terms of edges
                // return 0; // If height is measured in terms of nodes
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree bTree = new BinaryTree();

        // Reset the index before building the tree
        // BinaryTree.idx = -1;

        // Build the tree from the array
        Node root = BinaryTree.buildTree(nodes);

        // Calculate and print the height of the tree
        System.out.println("Height of the binary tree is: " + bTree.height(root));
    }
}
