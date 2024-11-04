public class length {
    public static int length(Node head){
        int count =0 ;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static class Node{
        int data; // value of next node
        Node next; // contain address of next node

        Node(int data){
            this.data=data;
        }
    }


    public static void main(String[] args) {
        Node x=new Node(5);
        System.out.println(x.next);
        Node a=new Node(3);
        Node b=new Node(9);
        Node c=new Node(8);
        Node d=new Node(16);
        Node e=new Node(12);
        Node f=new Node(23);
        // 5 ->3 -> 9 ->8 ->16
        x.next=a;
        System.out.println(x.next.data);// it print value next to x
        System.out.println(x.data);// print data of x
        // to connect all the element 
        a.next=b;  // 5 ->3 ->9
        b.next=c;   // 5 ->3 ->9 ->8
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println(length(a));
    }
}
