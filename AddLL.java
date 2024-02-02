import java.util.Scanner;
public class AddLL{
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
    Node addTwoNumbers(Node l1,Node l2){
        Node preptr=null;
        Node ptr1=l1;
        Node ptr2=l2;
        int m=0,n=0,sum;
        while(ptr1!=null){
           ptr1=ptr1.next;
           m++;
        }
        while(ptr2!=null){
            ptr2 = ptr2.next;
            n++;
        }
        if(m==n){
            preptr=new Node(0);
        }
        ptr1=l1;
        ptr2=l2;
        head=null;
        ptr=null;
        while(m>n || m<n){
            if(m>n){
                Node newNode=new Node(ptr1.data);
                if(head==null){
                   head = newNode;
                   ptr=newNode;
                }
                else{
                    ptr.next=newNode;
                }
                preptr=ptr;
                ptr1=ptr1.next;
                m--;
            }
            else if(n>m){
                Node newNode=new Node(ptr2.data);
                if(head==null){
                   head = newNode;
                   ptr=newNode;
                }
                else{
                    ptr.next=newNode;
                }
                preptr=ptr2;
                ptr2=ptr2.next;
                n--;
            }
        }
        while(ptr1!=null){
            sum=ptr1.data +ptr2.data;
            Node sumNode = new Node(sum%10);
            int carry = sum/10;
            if(head == null){
                head=sumNode;
                head.next=null;
                ptr=head;
                if(carry !=0){
                    preptr.data+=carry;
                    preptr.next=ptr;
                    head = preptr;
                }
            }
            else{
                preptr=ptr;
                preptr.data += carry;
                ptr.next=sumNode;
                ptr=ptr.next;
            }
            ptr1=ptr1.next;
            ptr2=ptr2.next;
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
}
