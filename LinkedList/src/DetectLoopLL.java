import java.util.HashSet;

public class DetectLoopLL {
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

        Node t = detectLoopHashing(head);
        detectLoop(head);
        System.out.println(t.data);
    }

    private static void detectLoop(Node head) {
        Node curr = head;
        Node temp = new Node(1000);
        while(curr!=null){
            if(curr.next==null) return;
            if(curr.next==temp) System.out.println(curr.data);
            Node t = curr.next;
            curr.next=temp;
            curr=t;
        }
    }

    private static Node detectLoopHashing(Node head) {
        HashSet<Node> h = new HashSet<>();
        Node curr= head;
        while(curr!=null){
            if(!h.contains(curr)){
                h.add(curr);
                curr=curr.next;
            }
            else
                return curr;
        }
        return curr;
    }
}
