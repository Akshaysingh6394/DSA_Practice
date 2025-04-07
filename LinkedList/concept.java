package LinkedList;

public class concept {
    
class Node{
        int data;
        Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    } 
}
public static Node head;
public static Node tail;
public void addFirst(int data){
    Node newNode = new Node(data);
    if(head==null){
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}
public void addLast(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=tail =null;
        return;
    }
    tail.next = newNode;
    tail=newNode;
}
public void print(){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+"------->");
        temp = temp.next;
    }
    System.out.println("null");
}
    
    public static void main(String[] args) {    
    concept ll = new concept();
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);
    ll.print();
}
}
