class myStack{
    private int top, cap;
    private int[] arr ;

    myStack(int x){
        top = -1;
        cap = x;
        arr = new int[cap];
    }

    public void push(int ele){
        top++;
        if(top!=cap) arr[top] = ele;
        else {
            top--;
            System.out.println("Stack overflow");
        }
    }
    public int peek(){
        return arr[top];
    }

    public int pop(){
        if(top==-1) {
            System.out.print("Stack Underflow :"+ " ");
            return -1;
        }
        int a = arr[top];
        top--;
        return a;
    }
    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return top==-1 ;
    }

    public void display(){
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class StackArrayImpl {
    public static void main(String[] args){
        myStack s = new myStack(3);
        s.push(3);
        s.push(8);
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        s.push(10);
        s.push(14);
        System.out.println(s.peek());
        s.display();
        System.out.println(s.size());
        s.push(88);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
