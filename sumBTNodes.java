class Node{
   int data;
   Node left,right;
   public Node(int data){
      this.data = data;
      left=null;
      right=null;
   }
}
public class sumBTNodes {
   public static void main(String[] args) {
      BinaryTree obj = new BinaryTree();
      Node root= new Node(1);
      root.left= new Node(2);
      root.right = new Node(3);
      int sum = obj.sumBT(root);
      System.out.println(sum);
   }
}
class BinaryTree
{
    static int sumBT(Node head){
        //Code
        int sum =0;
        sum=preOrder(head,sum);
        return sum;
    }
    static int preOrder(Node head,int sum){
        if(head == null)
           return sum;
        sum+= head.data;
        sum=preOrder(head.left,sum);
        sum=preOrder(head.right,sum);
        return sum;
    }
}