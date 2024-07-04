package BinaryTrees;

public class Binary_postorder {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
          this.data=data;
          this.left=null;
          this.right=null;  
        }
        
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
           idx++;
           if (nodes[idx]== -1) {
            return null;  
           } 
           Node newNode=new Node(nodes[idx]);
           newNode.left=buildtree(nodes);
           newNode.right=buildtree(nodes);
           return newNode;
        }

        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // BinaryTree bTree = new BinaryTree();
        Node root = BinaryTree.buildtree(nodes);
        System.out.println("Postorder traversal:");
        BinaryTree.postorder(root);
    }
}
