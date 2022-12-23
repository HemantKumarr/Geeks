import java.util.Deque;

class Node8{
    char data;
    Node8 next= null;
    Node8(char x){
        data =x;
        next=null;
    }
}

public class PalindromeLL {
    public static void main(String[] args){
        Node8 head =  new Node8('R');
        Node8 temp1 = new Node8('A');
        Node8 temp2 = new Node8('D');
        Node8 temp3 = new Node8('A');
        Node8 temp4 = new Node8('R');
        head.next =temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=temp4;

// naive approach is to create a stack data structure and then compare each pop element with initial elements till mid node.

        Node8 slow=head, fast = head;
        while(fast.next!=null&& fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        System.out.println(slow.data);
        Node8 rev =  reverseList(slow.next);
        System.out.println(rev.data);

        Node8 curr= head;
        boolean flag = true;
        while(rev!=null){
            if(curr.data!=rev.data) {
                flag=false;
                break;
            }
            curr=curr.next;
            rev = rev.next;
        }
        System.out.println(flag);
    }

    private static Node8 reverseList(Node8 next) {
        Node8 curr = next,pre=null;
        while(curr!=null){
            Node8 temp = curr.next;
            curr.next=pre;
            pre =curr;
            curr=temp;
        }
        return pre;
    }
}
