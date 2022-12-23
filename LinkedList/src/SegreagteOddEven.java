public class SegreagteOddEven {
    public static void main(String[] args){
        Node head = new Node(7);
        Node temp1 = new Node(23);
        Node temp2 = new Node(8);
        Node temp3 = new Node(55);
        Node temp4 = new Node(72);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        Node os=null, oe=null, es=null, ee=null;

        for(Node curr = head; curr!=null; curr = curr.next ){
            int x = curr.data;
            if(x%2==0){
                if(es==null){
                    es=curr;
                    ee=curr;
                }
                else {
                    ee.next = curr;
                    ee=ee.next;
                }
            }
            else {
                if (os == null) {
                    os = curr;
                    oe = curr;
                }
                else {
                    oe.next = curr;
                    oe=oe.next;
                }
            }
        }
        if(os==null||es==null) return;
        ee.next=os;
        oe.next=null;
// starting the node from es (even start)
        for(Node n = es; n!=null;n=n.next) System.out.println(n.data);
    }
}
