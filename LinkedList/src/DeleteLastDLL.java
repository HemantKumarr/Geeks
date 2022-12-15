public class DeleteLastDLL {
    public static void main(String[] args){
        Node1 head = new Node1(5);
        Node1 temp1 = new Node1(15);
        Node1 temp2 = new Node1(65);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        Node1 temp = delLAst(head);
        for(temp = head;temp!=null;temp=temp.next) System.out.println(temp.data);
    }

    private static Node1 delLAst(Node1 head) {
        if(head==null || head.next==null) return null;
        Node1 t = head;
        while(t.next!=null) t=t.next;
        t.prev.next=null;
        return head;
    }
}
