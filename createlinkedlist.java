//L.I.N.K.E.D  L.I.S.T
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
        Node b=new Node(5);
        Node c=new Node(6);
        Node d=new Node(8);
        Node e=new Node(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(b.data);
        System.out.println(a.next.data);
      
    }  
}
