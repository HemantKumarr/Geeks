public class ReverseDLL {
    public static void main(String[] args){
        Node1 head = new Node1(5);
        Node1 temp1 = new Node1(15);
        Node1 temp2 = new Node1(65);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;

        Node1 pre=null, curr =head;
        while(curr!=null){
            pre = curr.prev;    //pre = curr.next
            curr.prev=curr.next;// curr.next = curr.prev
            curr.next=pre;      // curr.prev =pre   -  didnt work, why?
            curr=curr.prev;
        }
        for (Node1 t = pre.prev;t!=null;t=t.next) System.out.println(t.data);
    }
}
