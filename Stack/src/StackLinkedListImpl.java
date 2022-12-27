class Node{
    int data;
    Node next = null;
    Node( int x){
        data = x;
        next = null;
    }
}

class myStack2{
    int size;
    Node head;

    myStack2(){
        size=0;
        head=null;
    }
    public void push(int ele){
        size++;
        Node temp = new Node(ele);
        if(head== null) head = temp;
        else{
            temp.next=head;
            head = temp;
        }
    }

    public int pop() {
        size--;
        if (head == null) {
            System.out.println("Stack underflow");
            return -1;
         }
        else{
            int del = head.data;
            head=head.next;
            return del;
        }
    }
    public int size(){
        return size;
    }

    public int peek(){
        return head.data;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void display(){
        for(Node n =head; n !=null; n = n.next) System.out.print(n.data + " ");
        System.out.println();
    }
}

public class StackLinkedListImpl {
    public static void main(String[] args){
        myStack2 ms1 = new myStack2();
        ms1.push(3);
        ms1.push(7);
        ms1.push(9);
        System.out.println(ms1.size());
        System.out.println(ms1.pop());
        System.out.println(ms1.size());
        System.out.println(ms1.isEmpty());
        ms1.push(13);
        System.out.println(ms1.peek());
        System.out.println(ms1.size());
        ms1.display();

    }

}
