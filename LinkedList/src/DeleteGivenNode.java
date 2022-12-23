public class DeleteGivenNode {
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

        temp2.data=temp2.next.data;
        temp2.next=temp2.next.next;
        for(Node n = head;n!=null;n=n.next) System.out.println(n.data);
    }
}
