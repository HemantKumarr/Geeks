class Node2{
    int data;
    Node2 next;
    Node2(int x){
        data = x;
        next = null;
    }
}

public class DeleteEnd {
    public static void main(String[] args) {
        Node2 head = new Node2(10);
        Node2 temp1 = new Node2(20);
        Node2 temp2 = new Node2(30);
        head.next = temp1;
        temp1.next = temp2;
        Node2 curr = head;
        while(curr.next.next!=null){
            curr= curr.next;
        }
        curr.next = null;
        Node2 x = head;
        while (x!=null){
            System.out.println(x.data);
            x=x.next;
        }
    }
}
