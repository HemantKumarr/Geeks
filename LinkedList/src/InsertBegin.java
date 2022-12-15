import java.util.Scanner;

//class Node1{
//    int data;
//    Node1 next;
//    Node1(int x){
//        data = x;
//        next = null;
//    }
//}

public class InsertBegin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next =temp1;
        temp1.next=temp2;
        System.out.println("initial linked list");
        Node x = head;
        while (x!=null){
            System.out.println(x.data);
            x=x.next;
        }
        int begin = sc.nextInt();
        Node t = inserting(head,begin);
        System.out.println("After insertion of the values");
        x=t;
        while (x!=null){
            System.out.println(x.data);
            x=x.next;
        }
    }

    private static Node inserting(Node head, int begin) {
        Node temp = new Node(begin);
        temp.next=head;
        return temp;
    }
}
