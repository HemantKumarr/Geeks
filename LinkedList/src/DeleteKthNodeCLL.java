import java.util.Scanner;

public class DeleteKthNodeCLL {

    public static void main(String[] args){
        Node2 head = new Node2(10);
        Node2 temp1 = new Node2(20);
        Node2 temp2 = new Node2(30);
        Node2 temp3 = new Node2(40);
        head.next =temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next = head;

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if(k==1) deleteHead(head);
        Node2 curr = head;
        for (int i = 0; i < k-2; i++) {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        System.out.println(head.data);
        for(Node2 t =head.next;t!=head;t=t.next) System.out.println(t.data);
    }

    private static void deleteHead(Node2 head) {
        head.data=head.next.data;
        head.next=head.next.next;
        System.out.println(head.data);
        for(Node2 t =head.next;t!=head;t=t.next) System.out.println(t.data);
        System.out.println("deletion over");
    }
}
