import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    Node1(int x){
        data = x;
        next = null;
    }
}

public class InsertBegin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node1 head = new Node1(10);
        Node1 temp1 = new Node1(20);
        Node1 temp2 = new Node1(30);
        head.next =temp1;
        temp1.next=temp2;
        System.out.println("initial linked list");
        Node1 x = head;
        while (x!=null){
            System.out.println(x.data);
            x=x.next;
        }
        int begin = sc.nextInt();
        Node1 t = inserting(head,begin);
        System.out.println("After insertion of the values");
        x=t;
        while (x!=null){
            System.out.println(x.data);
            x=x.next;
        }
    }

    private static Node1 inserting(Node1 head, int begin) {
        Node1 temp = new Node1(begin);
        temp.next=head;
        return temp;
    }
}
