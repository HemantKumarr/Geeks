import java.util.Scanner;

class Node3{
    int data;
    Node3 prev,next;
    Node3(int x){
        data=x;
        prev=null;
        next=null;
    }
}

public class CircularDLL {
    public static void main(String[] args){
        Node3 head = new Node3(6);
        Node3 temp1 = new Node3(14);
        Node3 temp2 = new Node3(45);
        head.prev=temp2;
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        temp2.next=head;

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Node3 temp = new Node3(x);
        temp.next=head;   // same code for insert end also, just return the head node.
        temp.prev=head.prev;
        head.prev.next=temp;
        head.prev=temp;
        System.out.println(temp.data);
        for(Node3 n = temp.next;n!=temp;n= n.next) System.out.println(n.data);
    }
}
