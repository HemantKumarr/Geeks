class Node1{
    int data;
    Node1 prev =null;
    Node1 next =null;
    Node1(int x){
        data = x;
        prev = null;
        next = null;
    }
}

public class DoubleLL {
    public static void main(String[] args){
        Node1 head = new Node1(7);
        Node1 temp1 = new Node1(15);
        Node1 temp2 = new Node1(38);
        head.prev =null;
        head.next=temp1;
        temp1.prev = head;
        temp1.next=temp2;
        temp2.prev=temp1;
        temp2.next = null;
        for(Node1 i = head;i!=null;i=i.next) System.out.println(i.data);
    }
}
