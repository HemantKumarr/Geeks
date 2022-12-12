class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class SinglyLL {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next =temp1;
        temp1.next=temp2;
        Node x = head;
        while (x!=null){
            System.out.println(x.data);
            x=x.next;
        }
        x = head;
        for (; x!=null; x = x.next){
            System.out.println(x.data);
        }
        recursive(head);
    }

    private static void recursive(Node head) {
        if(head==null) return ;
        recursive(head.next);  // interchange line 31 n 32 to print the list in actual order.
        System.out.println(head.data);
    }
}
