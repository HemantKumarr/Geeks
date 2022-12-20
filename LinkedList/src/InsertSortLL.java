import java.util.Scanner;

public class InsertSortLL {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next =temp1;
        temp1.next=temp2;
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        Node temp = new Node(x);
        if(temp.data<head.data){
            temp.next=head;
            for(Node n = temp;n!=null;n=n.next) System.out.println(n.data);
        }
        else{
            Node curr = head;
            while(curr.next!=null && temp.data>curr.next.data ) curr=curr.next;
            temp.next=curr.next;
            curr.next=temp;
        }
        for(Node n = head;n!=null;n=n.next) System.out.println(n.data);
    }
}
