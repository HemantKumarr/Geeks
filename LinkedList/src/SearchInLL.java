import java.util.Scanner;

public class SearchInLL {

    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next =temp1;
        temp1.next=temp2;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int pos=0; // searching is O(n) in LL. In sorted arrays searching is O(logn) which is not possible in LL since
//        we cant find middle element in O(1) time.
        for(Node t =head;t!=null;t=t.next){
            pos++;
            if(t.data==x) {
                System.out.println(pos);
                return;
            }
        }
    }
}
