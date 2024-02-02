import java.util.Scanner;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        left=null;
        right = null;
    }
}
public class TreeTraversal{
    public static void main(String[] args){
        int ch;
        Node root= null;
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        while(true){
            System.out.format("\n1.Create a node \n2.PreOrder Traversal\n3.InOrder\n4.PostOrder\n5.Exit\n");
            ch = sc.nextInt();
            switch(ch){
                case 1: root=obj.create(root);
                        break;
                case 2: obj.preOrder(root);
                        break;
                case 3: obj.inOrder(root);
                        break;
                case 4: obj.postOrder(root);
                        break;
                case 5:System.exit(0);
                       break;
            }
        }
    }
}
class Solution{
    Node create(Node root){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Enter Node");
        System.out.println("2.Null");
        int ch = sc.nextInt();
        switch(ch){
            case 1: System.out.println("Enter the data");
                    root=new Node(sc.nextInt());
                    System.out.println("Left Node:");
                    root.left=create(root.left);
                    System.out.println("Right Node :");
                    root.right = create(root.right);
                    break;
            case 2:return null;
        }
        return root;
    }
    void preOrder(Node root){
        if(root==null)
           return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    void inOrder(Node root){
        if(root == null)
           return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    void postOrder(Node root){
        if(root == null)
           return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}