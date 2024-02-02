class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left=null;
        right= null;
    }
}
public class minBST{
    public static void main(String[] args){
        Solution obj = new Solution();
        Node root = new Node(5);
        root.left= new Node(4);
        root.right = new Node(9);
        root.left.left = new Node(2);
        root.left.left.left = new Node(1);
        int min = obj.minValue(root);
        System.out.println(min);
    }
}
class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        if(node==null)
           return -1;
        if(node.left == null)
           return node.data;
        int min=minValue(node.left);
        return min;
    }
}