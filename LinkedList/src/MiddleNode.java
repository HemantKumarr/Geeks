public class MiddleNode {
    public static void main(String[] args){
        Node head =  new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        Node temp5 = new Node(60);
        head.next =temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;
        temp4.next=temp5;
// naive approach would be to calculate the length of the list and then display the element at the length/2 position
        Node fast = head, slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
}
