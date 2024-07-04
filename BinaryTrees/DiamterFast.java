package BinaryTrees;

public class DiamterFast {
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
            return buildTree(nodes, new int[]{0});
        }

        private static Node buildTree(int nodes[], int[] idx) {
            if (idx[0] >= nodes.length || nodes[idx[0]] == -1) {
                idx[0]++;
                return null;
            }
            Node newNode = new Node(nodes[idx[0]]);
            idx[0]++;
            newNode.left = buildTree(nodes, idx);
            newNode.right = buildTree(nodes, idx);
            return newNode;
        }

        // Helper class to store height and diameter
        static class HeightAndDiameter {
            int height;
            int diameter;

            HeightAndDiameter(int height, int diameter) {
                this.height = height;
                this.diameter = diameter;
            }
        }

        // Function to calculate height and diameter in a single traversal
        private static HeightAndDiameter heightAndDiameter(Node root) {
            if (root == null) {
                return new HeightAndDiameter(0, 0);
            }

            HeightAndDiameter left = heightAndDiameter(root.left);
            HeightAndDiameter right = heightAndDiameter(root.right);

            int height = Math.max(left.height, right.height) + 1;
            int diameter = Math.max(left.height + right.height, Math.max(left.diameter, right.diameter))+1;

            return new HeightAndDiameter(height, diameter);
        }

        public static int diameter(Node root) {
            return heightAndDiameter(root).diameter;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree bTree = new BinaryTree();

        Node root = BinaryTree.buildTree(nodes);
        int treeDiameter = BinaryTree.diameter(root);

        System.out.println("Diameter of the binary tree is: " + treeDiameter);
    }
}

