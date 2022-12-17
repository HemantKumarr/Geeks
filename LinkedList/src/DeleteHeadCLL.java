public class DeleteHeadCLL {
    public static void main(String[] args){
        Node2 head = new Node2(10);
        Node2 temp1 = new Node2(20);
        Node2 temp2 = new Node2(30);
        head.next =temp1;
        temp1.next=temp2;
        temp2.next = head;

        if(head==null || head.next==null)return;
        head.data=head.next.data;
        head.next=head.next.next;
        System.out.println(head.data);
        for(Node2 t = head.next;t!=head;t=t.next) System.out.println(t.data);

        naive();
    }

    private static void naive() {
        Node2 head = new Node2(10);
        Node2 temp1 = new Node2(20);
        Node2 temp2 = new Node2(30);
        head.next =temp1;
        temp1.next=temp2;
        temp2.next = head;

        if(head==null || head.next==null)return;
        Node2 curr = head;
        while(curr.next!=head)curr=curr.next;
        curr.next=head.next;
        head=head.next;
        System.out.println("Naive");
        System.out.println(head.data);
        for(Node2 t =head.next; t!=head;t=t.next) System.out.println(t.data);
    }

}
