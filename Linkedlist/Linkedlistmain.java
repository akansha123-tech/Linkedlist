public class Linkedlistmain {
    Node head;
    private int size;
    Linkedlistmain(){
        this.size=0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add to the start of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add to the end of the list
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    // delete first element 
    public void deletefirst(){
        if(head==null){
            System.out.println("list is empty");
            return;

        }
        size--;
        head=head.next;
    }

    //  delete last element 
    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");
            return;

        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }

    
    public static void main(String[] args) {
        Linkedlistmain list = new Linkedlistmain();// creating object
        list.addFirst("a");
        list.addFirst("is");
        list.printList(); 
        list.addLast("List");
        list.printList();
        list.addFirst("this");
        list.printList(); 
        list.deletefirst();
        list.printList();
        list.deletelast();
        list.printList();
        list.getSize();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("thise");
        list.printList();
        System.out.println(list.getSize());
    }
}  