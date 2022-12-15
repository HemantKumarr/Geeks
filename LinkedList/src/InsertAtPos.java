import java.util.Scanner;

//class Node6 {
//    int data;
//    Node6 next;
//    Node6(int x){
//        data = x;
//        next = null;
//    }
//}

public class InsertAtPos {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next =temp1;
        temp1.next=temp2;
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int inp = sc.nextInt();
        Node temp = new Node(inp);
        if(pos==1){
            temp.next = head;
            for(Node t = temp; t!=null; t=t.next) System.out.println(t.data);
        }
        else{
            Node curr = head;
            for(int i =1; i<=pos-2&& curr!=null;i++) curr = curr.next;
            if(curr==null) return;
            temp.next=curr.next;
            curr.next=temp;
            for(Node t = head; t!=null; t=t.next) System.out.println(t.data);
        }
    }

}
