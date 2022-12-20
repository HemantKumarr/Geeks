public class RemDupSortSLL {
    public static void main(String[] args){
        Node head =  new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(30);
        Node temp4 = new Node(30);
        head.next =temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;

        Node curr = head; //  curr!=null will be false when head = null.
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else curr=curr.next;
        }
        for(Node n =head;n!=null;n=n.next) System.out.println(n.data);
    }
}
