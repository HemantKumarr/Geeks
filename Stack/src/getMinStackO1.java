import java.util.Stack;

class  StackMin{
    private Stack<Integer> ms ;
    private Stack<Integer> as ;
    StackMin(){
        ms = new Stack<>();
        as = new Stack<>();
    }

    void push(int x) {
        if (ms.isEmpty() && as.isEmpty()) {
            ms.push(x);
            as.push(x);
        }
        ms.push(x);

        if(ms.peek()<=as.peek()) as.push(x);
    }
    int pop(){
        if(as.peek().equals(ms.peek())){
            int a = ms.peek();
            ms.remove(ms.size()-1);
            as.remove(as.size()-1);
            return a;
        }
        int a = ms.peek();
        ms.remove(ms.size()-1);
        return a;
    }

    int getMin(){
        return as.peek();
    }
}

public class getMinStackO1 {
    public static void main(String[] args){

        StackMin s = new StackMin();
        s.push(5);
        s.push(4);
        s.push(8);
        System.out.println(s.getMin());
        s.push(1);
        System.out.println(s.getMin());
        s.pop();
        s.pop();
        s.pop();
        s.push(0);
        s.push(0);
        s.pop();
        System.out.println(s.getMin());
    }

}
