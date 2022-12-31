import java.util.LinkedList;

class Staack1{
    private int cap,size;
    private Queue q ;

    Staack1(int x){
        cap = x;
        q = new Queue(x);
        size = 0;
    }

    void push(int ele){
        q.enqueue(ele);
        size++;
    }

    void pop(){}

}

public class StackImplUsingQueue {
    public static void main(String[] args){
        Staack1 st = new Staack1(5);
        LinkedList<Integer> l = new LinkedList<>();
        l.add(5);

    }
}
