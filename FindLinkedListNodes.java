import java.util.Scanner;
public class FindLinkedListNodes{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Solution obj = new Solution();
    Solution.Node head = obj.new Node(0);
    int n = sc.nextInt();
    int i,ele;
    for(i=0;i<n;i++){
        ele= sc.nextInt();
        head = obj.createLLRear(ele);
    }
    //Write calling statements
}
}
class Solution{
    class Node{
        int data;
        Node next;
        Node(int ele){
            this.data =ele;
        }
    }
    Node head=null,ptr=null;
    Node createLLRear(int ele){
        Node newNode = new Node(ele);
        if(head==null){
           head = newNode;
           ptr= newNode;
        }
        else{
            ptr.next=newNode;
            ptr=ptr.next;
        }
        return head;  
    }
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	int count=0;
    	Node ptr=head,refptr=head;
    	if(head==null)
    	  return -1;
    	else{
    	    while(count<n){
    	        if(refptr==null)
    	          return -1;
    	        refptr=refptr.next;
    	        count++;
    	    }
    	    if(refptr==null)
    	       return head.data;
    	    while(refptr !=null){
    	        ptr=ptr.next;
    	        refptr=refptr.next;
    	    }
    	    
    	}
    	return ptr.data;
    }
    int getMiddle(Node head)
    {
         // Your code here.
         Node slowptr=head,fastptr=head;
         if(head == null)
            return 0;
         while(fastptr!=null && fastptr.next!=null){
             slowptr=slowptr.next;
             fastptr = fastptr.next.next;
         }
         return slowptr.data;
    }
}