import java.util.Scanner;
public class IsLLPalindrome{
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
    System.out.println(obj.isPalindrome(head));
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
    boolean isPalindrome(Node head) 
    {
        //Your code here

        boolean isPal=false;
        if(head==null || head.next==null)
           return true;
        Node slowptr=head,fastptr=head,preslowptr=head;
        while(fastptr!=null && fastptr.next!=null){
            preslowptr = slowptr;
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        if(fastptr!=null){
            slowptr=slowptr.next;
        }
        preslowptr.next = null;
        Node midNode=reverseList(slowptr);
        while(head!=null && midNode!=null){
            if(head.data == midNode.data)
               isPal = true;
            else
               return false;
            head=head.next;
            midNode=midNode.next;
        }
        return isPal;
        
    } 
    Node reverseList(Node midhead)
    {
        // code here
        Node preptr=null,ptr=midhead,postptr=midhead;
        if(midhead==null)
          return null;
        while(ptr!=null){
            postptr=ptr.next;
            ptr.next=preptr;
            preptr=ptr;
            ptr=postptr;
        }
        midhead=preptr;
        return midhead;
    }
}

