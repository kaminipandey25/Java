//PRINTING OF LINKED LIST IF LENGTH IS NOT KNOWN

public class LL{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String args[]){
        Node a=new Node(6);
        Node b=new Node(4);
        Node c=new Node(8);
        Node d=new Node(7);
        Node e=new Node(4);
        Node f=new Node(3);
        Node g=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        Node temp=a;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }
}
