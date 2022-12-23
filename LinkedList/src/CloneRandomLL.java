import java.util.HashMap;

class Node7{
    int data;
    Node7 next, random;
    Node7(int x){
        data=x;
        next =random= null;
    }
}

public class CloneRandomLL {

    public static void main(String[] args){
        Node7 head =  new Node7(10);
        Node7 temp1 = new Node7(20);
        Node7 temp2 = new Node7(30);
        Node7 temp3 = new Node7(40);
        Node7 temp4 = new Node7(50);
        head.next =temp1;
        head.random = temp3;
        temp1.next=temp2;
        temp2.next=temp3;
        temp2.random=temp1;
        temp3.next=temp4;
        temp3.random=temp1;

        optimize(head);

        HashMap<Node7, Node7> h = new HashMap<>();
        Node7 curr = head;
        while(curr!=null) {
            h.put(curr,new Node7(curr.data));
            curr = curr.next;
        }
        for(Node7 n = head ; n!=null; n = n.next)
        {
            Node7 temp = h.get(n);
            temp.next= h.get(n.next);
            temp.random = h.get(n.random);
        }
        Node7 clone = h.get(head);
        for(Node7 n = clone ; n!=null; n = n.random){
            System.out.println(n.data);
        }
    }

    private static void optimize(Node7 head) {
        Node7 curr = head;
        while(curr!=null){
            Node7 next = curr.next;
            curr.next = new Node7(curr.data);
            curr.next.next=next;
            curr=next;
        }
        for(Node7 n = head; n!=null; n=n.next.next){
            n.next.random = (n.random==null)?null: n.random.next;
        }

        Node7 h2=head.next;
        Node7 clone = h2;
        for(curr = head; clone!=null; curr=curr.next){
            curr.next=curr.next.next;
            clone.next = (clone.next==null)?clone.next: clone.next.next;
            clone=clone.next;
        }

        for(Node7 n =h2; n !=null; n =n.random) System.out.println(n.data);
        System.out.println("-------");
    }
}
