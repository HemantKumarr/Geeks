class Node2{
    int data;
    Node2 next =null;
    Node2(int x){
        data = x;
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
        System.out.println(head.data);
        for(Node2 t =head.next;t!=head;t=t.next ) System.out.println(t.data);
        System.out.println("Method 2 of traversing circular LL");
        Node2 r = head;
        do{
            System.out.println(r.data);
            r=r.next;
        }while(r!=head);

    }
}
