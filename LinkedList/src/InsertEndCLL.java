import java.util.Scanner;

public class InsertEndCLL {
    public static void main(String[] args){
        Node2 head = new Node2(10);
        Node2 temp1 = new Node2(20);
        Node2 temp2 = new Node2(30);
        head.next =temp1;
        temp1.next=temp2;
        temp2.next = head;

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Node2 temp = new Node2(x);
        if(head==null)temp.next=temp;
        int y = head.data;
        head.data = temp.data;
        temp.data=y;
        temp.next=head.next;
        head.next=temp;
        System.out.println(temp.data);
        for(Node2 t = temp.next;t!=temp;t=t.next) System.out.println(t.data);
        naive();

    }

    private static void naive() {
        Node2 head = new Node2(10);
        Node2 temp1 = new Node2(20);
        Node2 temp2 = new Node2(30);
        head.next =temp1;
        temp1.next=temp2;
        temp2.next = head;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Node2 temp = new Node2(x);
        int y = head.data;
        if(head==null)temp.next=temp;
        Node2 curr = head;
        while (curr.next!=head) curr=curr.next;
        curr.next=temp;
        temp.next=head;
        System.out.println("naive");
        System.out.println(head.data);
        for(Node2 t = head.next;t!=head;t=t.next) System.out.println(t.data);
    }
}
