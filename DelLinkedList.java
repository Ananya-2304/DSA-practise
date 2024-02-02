import java.util.Scanner;
public class DelLinkedList{
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
     Node removeNthFromEnd(Node head, int n) {
        Node ptr = head;
        int count=0;
        if(head==null|| head.next==null)
           return null;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        ptr=head;
        
        if(count==1 && n==1){
          ptr.next=null;
          return head;
        }
        n=count-n;
        if(n==0){
            head= ptr.next;
            return head;
        }
        while((--n) >0){
            ptr=ptr.next;
        }
        ptr.next= ptr.next.next;
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
    Node removeElementsGivenData(Node head, int item) {
        Node preptr=head,ptr=head;
        if(head==null)
           head=null;     
        else{
        while(ptr!=null){
            if(head.data ==item){
                head=head.next;
                ptr=head;
                preptr=head;
            }
            else if(ptr.data == item){
                preptr.next=ptr.next;
                ptr=ptr.next;
            }
            else{
            preptr=ptr;
            ptr=ptr.next;
        }
        }
        }
        return head;
    }
    void deleteNode(Node node) {

            node.val=node.next.val;
            node.next=node.next.next;

    }
    Node deleteMiddle(Node head) {
        Node slowptr=head,fastptr=head,slowpreptr=head;
        if(head == null)
           return null;
        else if(fastptr.next==null)
           return null;
        else{
        while(fastptr!=null && fastptr.next!=null){
            slowpreptr=slowptr;
            slowptr=slowptr.next;
            fastptr = fastptr.next.next;
        }
        slowpreptr.next = slowptr.next;
        }
        return head;
    
    }
}