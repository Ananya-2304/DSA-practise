import java.util.Scanner;
public class ReverseLinkedList{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Solution obj = new Solution();
        Solution.Node head = obj.new Node(0);
        int n = sc.nextInt();
        int ele;
        System.out.println("Enter the nodes");
        for(int i=0;i<n;i++){
            ele = sc.nextInt();
            head = obj.createLinkedListRear(ele);
        }
        obj.displayLinkedList(head);
        head = obj.reverseLinkedList(head);
        obj.displayLinkedList(head);
        obj.reverseLlWithoutReversing(head);
        System.out.println("NULL");
        obj.displayLinkedList(head);
    }
}
class Solution{
    class Node{
        int val;
        Node next;
        public Node(int ele){
            this.val=ele;
            this.next=null;
        }
    }
    Node head = null;
    Node ptr =null;
    Node createLinkedListRear(int ele){
       Node newNode = new Node(ele);
       if(head==null){
        head= newNode;
        ptr = newNode;
       }
       else{
        ptr.next= newNode;
        ptr= ptr.next;
       }
       return head;
    }
    void displayLinkedList(Node head){
        ptr=head;
        while(ptr!=null){
            System.out.print(ptr.val + " --> ");
            ptr=ptr.next;
        }
        System.out.println("NULL");
    }
    Node reverseLinkedList(Node head){
        Node preptr = null;
        Node postptr=null;
        ptr= head;
        while(ptr!=null){
            postptr=ptr.next;
            ptr.next=preptr;
            preptr=ptr;
            ptr=postptr;
        }
        head = preptr;
        return head;
    }
    void reverseLlWithoutReversing(Node head){
        if(head==null)
          return;
        reverseLlWithoutReversing(head.next);
        System.out.print(head.val + " --> ");
    }
}