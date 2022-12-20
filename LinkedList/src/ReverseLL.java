public class ReverseLL {
    public static void main(String[] args){
        Node head =  new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        head.next =temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;

        Node curr = head,pre=null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next=pre;
            pre =curr;
            curr=temp;
        }
        for (Node t = pre; t!=null; t=t.next) System.out.println(t.data);
    }
}
