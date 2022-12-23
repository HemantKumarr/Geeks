public class MergeSortLL {
    public static void main(String[] args){
        Node head1 =  new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
Node tempp = ne
        head1.next =temp1;
        temp1.next=temp2;
        temp2.next=temp3;

        Node head2 =  new Node(5);
        Node temp4 = new Node(15);
        Node temp5 = new Node(18);
        Node temp6 = new Node(50);

        head2.next =temp4;
        temp4.next=temp5;
        temp5.next=temp6;

        Node curr1 = head1, curr2 = head2;
        Node head=null,tail=null;
        if(curr1.data<=curr2.data){
            head=curr1;
            tail=curr1;
            curr1=curr1.next;
        }
        else{
            head=curr2;
            tail=curr2;
            curr2=curr2.next;
        }

        while (curr1!=null && curr2!=null){
            if(curr1.data<=curr2.data){
                tail.next=curr1;
                tail=curr1;
                curr1=curr1.next;
            }
            else {
                tail.next = curr2;
                tail=curr2;
                curr2 = curr2.next;
            }
        }

        if(curr1==null) tail.next=curr2;
        else tail.next=curr1;
        for(Node n =head;n!=null;n=n.next ) System.out.println(n.data);
    }
}
