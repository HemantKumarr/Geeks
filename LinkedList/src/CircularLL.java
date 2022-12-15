class Node2{
    int data;
    Node2 prev =null;
    Node2 next =null;
    Node2(int x){
        data = x;
        prev = null;
        next = null;
    }
}

public class CircularLL {

    public static void main(String[] args){
        Node2 head = new Node2(10);
        Node2 temp1 = new Node2(20);
        Node2 temp2 = new Node2(30);
        head.next =temp1;
        temp1.next=temp2;
        temp2.next = head;

        for(Node2 t =head;t!=null;t=t.next ) System.out.println(t.data);

    }
}
