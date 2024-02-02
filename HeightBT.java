  import java.util.Scanner;
  class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left=null;
        right = null;
    }
  }
  class HeightBT{
    public static void main(String[] args){
        Node root = null;
        Solution obj = new Solution();
        root = obj.createBT(root);
        System.out.println(obj.height(root));
    }
  }
  class Solution{
       Node createBT(Node root){
         int ch;
         Scanner sc = new Scanner(System.in);
         System.out.println("1.Enter Node    2.Null node");
         ch = sc.nextInt();
         switch(ch){
            case 1: System.out.println("Enter data");
                    root = new Node(sc.nextInt());
                    System.out.println("enter left node");
                    root.left = createBT(root.left);
                    System.out.println("Right Node");
                    root.right = createBT(root.right);
                    break;
            case 2:  return null;
         }
         return root;
       }
       int height(Node root){
        if(root == null)
           return 0;
        return (Math.max(height(root.left),height(root.right))+1);
       }
  }