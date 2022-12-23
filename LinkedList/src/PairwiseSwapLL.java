public class PairwiseSwapLL {
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

        if(head==null&&head.next==null) return;

        Node curr = head.next.next;
        Node pre = head;
        head = head.next;
        head.next = pre;

        while(curr!=null&&curr.next!=null){
            pre.next = curr.next;
            pre = curr;
            Node temp = curr.next.next;
            curr.next.next = curr;
            curr=temp;
        }
        pre.next=curr;

        for(Node n=head; n!=null;n=n.next) System.out.println(n.data);
    }
}
