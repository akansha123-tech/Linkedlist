public class InsertAtHead {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtHead(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }
        void deleteAt(int index){
            Node temp=head;
            for (int i =0;i<index-1;i++){
                temp=temp.next;
            }

            temp.next=temp.next.next;
            tail=temp;
            
        }
        int getAt(int idx){
            if (idx < 0 || idx > size()) { // Validate index
                System.out.println("Index out of bounds");
                return -1;
            }
            Node temp = head;
            for(int i =0 ;i<idx;i++){
             temp=temp.next;
            }
            return temp.data;
        }
        void insertat(int index, int val) {
            if (index < 0 || index > size()) { // Validate index
                System.out.println("Index out of bounds");
                return;
            }

            if (index == 0) {
                insertAtHead(val);
                return;
            }

            if (index == size()) {
                insertAtEnd(val);
                return;
            }

            Node t = new Node(val);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtHead(9);
        ll.insertat(2, 20);  // Insert 20 at index 2
        // ll.display();
        // System.out.println("Tail data: " + ll.tail.data);
       // ll.display();
       // System.out.println(ll.getAt(7));
        ll.deleteAt(2);
        ll.display();

        ll.display();     
        System.out.println(ll.tail.data);
    }
}
