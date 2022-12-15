import java.util.Scanner;

//class Node5 {
//    int data;
//    Node next;
//    Node5(int x){
//        data = x;
//        next = null;
//    }
//}

public class InsertEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        int end = sc.nextInt();
        Node temp = new Node(end);
        if(head == null){
            head = temp;
        }
        Node curr =head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next=temp;
        temp.next=null;
        for ( curr =head; curr!=null; curr = curr.next){
            System.out.println(curr.data);
        }
    }
}