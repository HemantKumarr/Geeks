import java.util.HashSet;

public class IntersectionLL {
    public static void main(String[] args){
        Node head1 =  new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        head1.next =temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;

        Node head2 =  new Node(15);
        Node temp5 = new Node(25);
        Node temp6 = new Node(35);
        head2.next =temp5;
        temp5.next=temp6;
        temp6.next=temp3;
        temp3.next=temp4;

        HashSet<Node> h = new HashSet<>();
        for(Node n = head1; n!= null; n=n.next) h.add(n);
        Node n;
        for(n = head2; n!= null; n=n.next) {
            if (!h.contains(n))
                h.add(n);
            else break;
        }
        System.out.println(n.data);

        optimize(head1,head2);
    }

    private static void optimize(Node head1, Node head2) {
        System.out.println("Optimize");
        int c1=0, c2=0;
        for(Node n =head1; n!=null;n=n.next) c1++;
        for(Node n =head2; n!=null;n=n.next) c2++;

        if(c1>c2){
            Node n1=head1,  n2 = head2;
            for(int i=0;i<c1-c2;i++) n1=n1.next;
            for(int i=0;i<c2;i++){
                if(n1==n2) {
                    System.out.println(n2.data);
                    break;
                }
                n1=n1.next;
                n2=n2.next;
            }
        }
        else{
            Node n2 =head2,n1=head1;
            for(int i=0; i<c2-c1; i++) n2=n2.next;
            for(int i=0;i<c1;i++){
                if(n1==n2) {
                    System.out.println(n2.data);
                    break;
                }
                n1=n1.next;
                n2=n2.next;
            }
        }
    }
}
