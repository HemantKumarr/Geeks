import java.util.Scanner;

public class InsertBeginDLL {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();

        Node1 head = new Node1(7);
        Node1 temp1 = new Node1(15);
        Node1 temp2 = new Node1(38);
        head.prev =null;
        head.next=temp1;
        temp1.prev = head;
        temp1.next=temp2;
        temp2.prev=temp1;
        temp2.next = null;

        Node1 temp = new Node1(x);
        temp.next=head;
        if(head!=null) head.prev=temp;
        temp.prev=null;
        head=temp;

        for(Node1 i = head;i!=null;i=i.next) System.out.println(i.data);
    }
}
