import java.util.Scanner;

public class NthLastNode {
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

        Scanner sc =new Scanner(System.in);
        int k = sc.nextInt();
        Node first = head, second = head;
        for (int i = 0; i <k ; i++) {
            if(first==null) return;
            first=first.next;
        }
        while(first!=null){
            second=second.next;
            first=first.next;
        }
        System.out.println(second.data);
    }
}
