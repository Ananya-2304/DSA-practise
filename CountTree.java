import java.util.Scanner;
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        left = null;
        right=null;
    }
}
public class CountTree{
    public static void main(String[] args){
        Node root=null;
        Solution obj = new Solution();
        root=obj.createBT(root);
        int count = obj.countLeaves(root);
        System.out.println(count);
    }
}
class Solution{
    Node createBT(Node root){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Enter data   2.Null Node");
        int ch = sc.nextInt();
        switch(ch){
            case 1: root= new Node(sc.nextInt());
                    System.out.println("Left Node");
                    root.left=createBT(root.left);
                    System.out.println("Right Node");
                    root.right=createBT(root.right);
                    break;
            case 2: return null;
        }
        return root;
    }
    int countLeaves(Node node) 
    {
         // Your code  
         int count=0;
         count=countLeafNodes(node,count);
         return count;
    }
    int countLeafNodes(Node root,int count){
        if(root == null)
           return count;
        if(root.left == null && root.right == null){
            count++;
            return count;
        }
        count =  countLeafNodes(root.left,count);
        count = countLeafNodes(root.right,count);
        return count;
    }
    public static int getSize(Node root)
	{
       //add Code here.
       int count = 0;
       count = countNodes(root,count);
       return count;
    }
    static int countNodes(Node root,int count){
        if(root==null)
           return count;
        count++;
        count=countNodes(root.left,count);
        count = countNodes(root.right,count);
        return count;
    }
    int countNonLeafNodes(Node root) {
	    //code here
	    int count=0;
	    count = countNonLeaves(root,count);
	    return count;
	}
	int countNonLeaves(Node root , int count){
	    if(root == null)
	      return count;
	    if(root.left==null && root.right == null)
	      return count;
	    count++;
	    count = countNonLeaves(root.left,count);
	    count = countNonLeaves(root.right,count);
	    return count;
	}
}