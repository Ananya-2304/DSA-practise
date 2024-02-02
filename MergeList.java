import java.util.Scanner;
public class MergeList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        Solution.Node head = obj.new Node(0);
        Solution.Node head2 = obj.new Node(0);
        int m = sc.nextInt();
        int n = sc.nextInt();
        head=null;
        head2=null;
        for(int i = 0;i<m;i++){
            int ele = sc.nextInt();
            head = obj.createNodeRear(ele,head);
        }
        head2 = null;
        for(int i = 0;i<n;i++){
            int ele = sc.nextInt();
            head2 = obj.createNodeRear(ele,head2);
        }
        System.out.println("LL1:");
        obj.displayLinkedList(head);
        System.out.println("LL2:");
        obj.displayLinkedList(head2);
        head=obj.mergeList(head,head2);
        System.out.println("LL3");
        obj.displayLinkedList(head);
    }
}
class Solution{
    class Node{
        int data;
        Node next;
        Node(int ele){
           data=ele;
           next=null;
        }
    }
    // Node head= null;
    // Node head2=null;
    Node ptr= null;
    Node createNodeRear(int ele,Node head){
        Node newNode = new Node(ele);
        if(head == null){
            head=newNode;
            ptr=head;
            head.next = null;
            return head;
        }
        ptr.next = newNode;
        ptr=newNode;
        return head;

    }
    void displayLinkedList(Node head){
        ptr=head;
        while(ptr !=null){
            System.out.print(ptr.data+" --> ");
            ptr=ptr.next;
        }
        System.out.println("NULL");
    }
    Node mergeList(Node list1,Node list2){
       Node newHead=null,ptr3=null;
       if(list1==null && list2 == null)
          return null;
       else if(list1==null){
          return list2;
       }
       else if(list2==null){
        return list1;
       }
       else{
        ptr=list1;
        Node ptr2=list2;
        if(list1.data<=list2.data){
            newHead=list1;
            ptr3=newHead;
            ptr=ptr.next;
        }
        else if(list2.data<list1.data){
            newHead=list2;
            ptr3=newHead;
            ptr2=ptr2.next;
        }
        
        while(ptr !=null && ptr2 !=null){
            if(ptr.data<ptr2.data){
                ptr3.next=ptr;
                ptr3 = ptr3.next;
                ptr=ptr.next;
            }
            else if(ptr2.data<ptr.data){
                 ptr3.next=ptr2;
                 ptr3 = ptr3.next;
                 ptr2=ptr2.next;
            }
        }
        if(ptr !=null){
            ptr3.next = ptr;
        }
        else if(ptr2 !=null)
           ptr3.next = ptr2;
       }
       return newHead;
    }
}