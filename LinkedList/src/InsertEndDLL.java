import java.util.Scanner;

public class InsertEndDLL {
    public static void main(String[] args){
        Node1 head = new Node1(5);
        Node1 temp1 = new Node1(15);
        Node1 temp2 = new Node1(65);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Node1 temp = new Node1(x);
        if(head==null) return ; //return temp
        Node1 t = head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
        temp.prev=t;

        for(temp = head;temp!=null;temp=temp.next) System.out.println(temp.data);
    }
}
