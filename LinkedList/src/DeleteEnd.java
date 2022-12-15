//class Node2{
//    int data;
//    Node2 next;
//    Node2(int x){
//        data = x;
//        next = null;
//    }
//}

public class DeleteEnd {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        Node curr = head;
        while(curr.next.next!=null){
            curr= curr.next;
        }
        curr.next = null;
        Node x = head;
        while (x!=null){
            System.out.println(x.data);
            x=x.next;
        }
    }
}
