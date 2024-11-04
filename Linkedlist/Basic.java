public class Basic {
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
        // 5 ->3 -> 9 ->8 ->16
        x.next=a;
        System.out.println(x.next.data);// it print value next to x
        System.out.println(x.data);// print data of x
        // to connect all the element 
        a.next=b;  // 5 ->3 ->9
        b.next=c;   // 5 ->3 ->9 ->8
        c.next=d; //// 5 ->3 ->9->8 ->16 
        //  Node temp = x;
        //  for (int i =1 ;i<=5;i++){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        //  }
        Node temp = x;
        while (temp!=null) {
            System.out.print(temp.data+"  ");//printing the list
            temp=temp.next;
        }
        
          
    }
}
