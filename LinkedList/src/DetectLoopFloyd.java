public class DetectLoopFloyd {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp1;

        Node slow=head,fast=head;
        while(fast!=null){
            if(slow==fast) {System.out.println("Loop exists");break;}
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("out");
    }

}
