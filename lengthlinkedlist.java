// FIND THE LENGTH OF A NODE

public class LL{
    public static void display(Node head){
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }

    public static int length(Node head){
        int count=0;
        while(head !=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;
    Node(int data){
        this.data=data;
    }
}
public static void main(String args[]){
    Node a=new Node(5);
    Node b=new Node(7);
    Node c=new Node(4);
    Node d=new Node(3);
    Node e=new Node(2);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    System.out.println(length(a));
}
}
