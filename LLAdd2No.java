import java.util.Scanner;
class LLAdd2No{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        Solution.Node l1 = obj.new Node(0); 
        Solution.Node l2 = obj.new Node(0);
        Solution.Node l3 = obj.new Node(0);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ele;
        for(int i=0;i<m;i++){
            ele = sc.nextInt();
            l1 = obj.createLL1atRear(ele);
        }
        for(int i=0;i<n;i++){
            ele = sc.nextInt();
            l2 = obj.createLL2atRear(ele);
        }
        l3= obj.addTwoNumbers(l1,l2);
        obj.displayLinkedList(l3);

    }
}
class Solution{
    class Node{
        int data;
        Node next;
        Node(int ele){
            this.data = ele;
            this.next = null;
        }
    }
    Node head=null;
    Node ptr= null;
    Node createLL1atRear(int ele){
        Node newNode = new Node(ele);
        if(head==null){
            head=newNode;
            ptr=head;
            return head;
        }
        else{
            ptr.next=newNode;
            ptr=ptr.next;
        }
        return head;
    }
    Node start =null,end=null;
    Node createLL2atRear(int ele){
        Node newNode = new Node(ele);
        if(start==null){
            start=newNode;
            end=start;
            return start;
        }
        else{
            end.next=newNode;
            end=end.next;
        }
        return start;
    }
    public Node addTwoNumbers(Node l1,Node l2) {
        int carry=0;
        head=null;
        ptr = null;
        while(l1!=null || l2!=null){
            int sum=carry;
            if(l1 !=null){
                 sum += l1.data;
                 l1=l1.next;
            }
            if(l2 != null){
                sum +=l2.data;
                l2 = l2.next;
            }
            Node sumNode= new Node(sum %10);
            carry = sum/10;
            if(ptr == null){
                head = sumNode;
                ptr=head;
            }
            else{
                ptr.next= sumNode;
                ptr = ptr.next;
            }
        }
        if(carry>0){
            Node sumNode = new Node(carry);
            ptr.next = sumNode;
        }
        return head;
    }
    void displayLinkedList(Node head){
        Node ptr=head;
        while(ptr!= null){
            System.out.print(ptr.data);
            ptr=ptr.next;
        }
    }
    void displayReverseLinkedList(Node head){
        if(head==null)
           return;
        displayReverseLinkedList(head.next);
        System.out.print(head.data);
    }
}