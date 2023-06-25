// PRINT LINKED LIST USING LOOP

public class LL{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String args[]){
        Node a=new Node(3);
        Node b=new Node(6);
        Node c=new Node(8);
        Node d=new Node(9);
        Node e=new Node(6);
        Node f=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node temp=a;
        for (int i=0;i<6;i++){
        System.out.print(temp.data+"-> ");
        temp=temp.next;
        }

    }
}
