import java.util.Scanner;
public class LinkList{
    public static void main(String[] args){
        int ele;
        Solution obj = new Solution();
        Solution.Node head = obj.new Node(0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            ele = sc.nextInt();
            head=obj.createNodeRear(ele);
            //head=obj.createNodeFront(ele);
        }
        obj.displayLinkedList(head);
        System.out.println("Enter position to be inserted");
        int pos = sc.nextInt();
        System.out.println("Enter the number to be inserted");
        ele = sc.nextInt();
        head = obj.insertNodeGivenPosition(ele,pos,head);
        obj.displayLinkedList(head);
        System.out.println("Enter the value before which item should be inserted");
        int val = sc.nextInt();
        System.out.println("Enter the number to be inserted");
        ele = sc.nextInt();
        head = obj.insertNodeGivenValue(ele,val,head);
        obj.displayLinkedList(head);
        System.out.println("Enter the number to be inserted");
        ele = sc.nextInt();
        obj.insertNodeRear(head,ele);
        obj.displayLinkedList(head);
        int count= obj.llCount(head);
        System.out.println("No of nodes is:"+ count);
        
    }
}
class Solution{
    class Node{
        int data;
        Node next;
    
    public Node(int ele){
        this.data = ele;
        this.next = null;
        }
    }
    public Node head = null;
    public Node tail=null;

    Node createNodeRear(int ele){
        Node newNode = new Node(ele);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        return head;
    }
    Node createNodeFront(int ele){
        Node newNode = new Node(ele);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    Node insertNodeGivenPosition(int ele,int pos,Node head){
        Node newNode= new Node(ele);
        tail= head;
        if(pos==1){
            newNode.next = head;
            head = newNode;
        }
        pos--;
        while(--pos !=0){
            tail=tail.next;
        }
        newNode.next= tail.next;
        tail.next= newNode;
        return head;
    }
    Node insertNodeGivenValue(int ele,int val,Node head){
        Node newNode = new Node(ele);
        Node pretail=head;
        tail=head.next;
        if(val==head.data){
            newNode.next=head;
            head= newNode;
        }
        while(tail.data !=val){
            pretail =tail;
            tail=tail.next;
        }
        newNode.next= pretail.next;
        pretail.next = newNode;
        return head;
    }
    void insertNodeRear(Node head,int ele){
        Node newNode = new Node(ele);
        tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next = newNode;

    }
    int llCount(Node head){
        tail=head;
        int count=0;
        while(tail!=null){
            tail=tail.next;
            count++;
        }
        return count;
    }
    void displayLinkedList(Node head){
        Node tail = head;
        while(tail != null){
            System.out.print(tail.data + " --> ");
            tail= tail.next;
        }
        System.out.println("NULL");
    }
}