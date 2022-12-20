public class RemoveLoopLL {
    public static void main(String[] args){
        Node head = new Node(5);
        Node temp1 = new Node(23);
        Node temp2 = new Node(8);
        Node temp3 = new Node(55);
        Node temp4 = new Node(73);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next=temp1;
        Node slow=head,fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) break;
        }
        int count =1;
        while(slow.next!=fast) {
            count++;
            slow=slow.next;
        }
        System.out.println("Length of the loop is : "+  count);
        slow=head;
        while(fast.next!=slow.next){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println("First node in the loop is : " + slow.next.data);
        fast.next=null;

        for (Node t = head;t!=null;t=t.next) System.out.println(t.data);
    }
}
