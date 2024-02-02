import java.util.Scanner;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class IdenticalTrees{
    public static void main(String[] args){
        Node root1 = null,root2=null;
        Solution obj = new Solution();
        root1 = obj.create(root1);
        root2 = obj.create(root2);
        if(isIdentical(root1,root2))
           System.out.println("Identical Trees");
        else
           System.out.println("Not Identical Trees");
    }
}
class Solution{
    Node create(Node root){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Enter Node   2.Null node");
        int ch = sc.nextInt();
        switch(ch){
            case 1: System.out.println("Enter data");
                    root = new root(sc.nextInt());
                    System.out.println("Enter left node");
                    root.left = create(root.left);
                    root.right = create(root.right);
                    break;
            case 2: return null;
        }
        return root;
    }
    boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    if(root1 == null && root2 == null)
	       return true;
	   else if(root2 == null)
	       return false;
	   else if(root1 == null)
	       return false;
	    if(root1.data != root2.data)
	       return false;
	    boolean left = isIdentical(root1.left,root2.left);
	    boolean right = isIdentical(root1.right,root2.right);
	    if(left && right)
	       return true;
	    else
	       return false;
	}
}