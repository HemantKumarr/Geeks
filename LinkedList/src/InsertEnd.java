import java.util.Scanner;

class Node4{
    int data;
    Node4 next;
    Node4(int x){
        data = x;
        next = null;
    }
}

public class InsertEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node4 head = new Node4(10);
        Node4 temp1 = new Node4(20);
        Node4 temp2 = new Node4(30);
        head.next = temp1;
        temp1.next = temp2;
        int end = sc.nextInt();
        Node4 temp = new Node4(end);
        Node4 curr =head;
        while(curr.next!=null){
            curr = curr.next;
        }

        curr.next=temp;
        temp.next=null;
        Node4 curr1;
        for ( curr =head; curr!=null; curr = curr.next){
            System.out.println(curr.data);
        }

    }
}