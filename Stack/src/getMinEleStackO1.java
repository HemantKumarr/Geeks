import java.util.Stack;

class Stack1{
    private Stack<Integer> st1;
    private int min;

    Stack1(){
        st1 = new Stack<>();
    }

    void push(int x){
        if(st1.isEmpty()){
            st1.push(x);
            min = x;
        }
        else if(x<=min){
            st1.push(x-min);
            min = x;
        }
        else st1.push(x);
    }

    int pop(){
        if(st1.peek()<=0) {
            int a =  min;
            min = min - st1.peek();
            st1.remove(st1.size()-1);
            return a;
        }
        int a = st1.peek();
        st1.remove(st1.size()-1);
        return a;
    }

    int peek(){
        return st1.peek();
    }

    int getMin(){
        return min;
    }
}

public class getMinEleStackO1 {

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(5);
        st.push(3);
        st.push(8);
        System.out.println(st.getMin());
        st.push(1);
        System.out.println(st.pop());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.getMin());
    }
}
