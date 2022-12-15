public class DeleteBeginDLL {
    public static void main(String[] args){
        Node1 head = new Node1(5);
        Node1 temp1 = new Node1(15);
        Node1 temp2 = new Node1(65);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        if(head == null)return;
        if(head.next == null) return ;
        if(head!=null){
            head = head.next;
            head.prev=null;
        }
        for(Node1 n = head;n!=null;n=n.next) System.out.println(n.data);
    }

}
