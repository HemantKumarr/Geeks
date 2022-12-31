class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

class Queue1 {
    private Node front,rear;
    private int size;

    Queue1(){
        size=0;
        front=null;
        rear=null;
    }

    void enqueue(int x){
        Node temp = new Node(x);
        size++;
        if(front==null){
            front=temp;
            rear=temp;
        }
        else {
            rear.next = temp;
            rear = temp;
        }

    }

    int dequeue(){
        if(front ==null) return -1;
        size--;
        int a = front.data;
        front = front.next;
        if(front == null) rear = null;
        return a;
    }

    int getSize(){
        return size;
    }

}


public class QueueUsingLinkedList {

    public static void main(String[] args){
        Queue1 q = new Queue1();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        System.out.println(q.dequeue());
        System.out.println(q.getSize());
        System.out.println(q.dequeue());
        System.out.println(q.getSize());
    }
}
