class Queue{
    private int size,front,cap;
    private int[] arr;

    Queue(int c){
    arr = new int[c];
    size=0;
    front =-1;
    cap = c;
    }

    boolean isFull(){
        return (cap == size);
    }

    boolean isEmpty(){
        return (size==0);
    }

    void enqueue(int x){
        if(isFull()){
            System.out.println("Array is full");
            return;
        }
        if(isEmpty()) front++;
        int rear = getRear();
        rear = (rear+1)%cap;
        arr[rear] = x;
        size++;
    }

    int dequeue(){
        if(isEmpty()) return -1;
        int a = arr[front];
        front = (front+1)%cap;
        size--;
        return a;
    }

    int getFront(){
        if(isEmpty()) return -1;
        else return front;
    }

    int getRear(){
        if(isEmpty()) return -1;
        else return  (front+size-1)%cap;
    }
}

public class QueueUsingArray {

    public static void main(String[] args){
        Queue q = new Queue(5);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(8);
        q.enqueue(10);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        System.out.println(q.isEmpty());
        q.enqueue(12);;
        System.out.println(q.getRear());
        System.out.println(q.isFull());
        q.enqueue(14);
        System.out.println(q.getRear()+ " " + q.getFront());
        System.out.println(q.isFull());
        q.enqueue(33);

    }
}
