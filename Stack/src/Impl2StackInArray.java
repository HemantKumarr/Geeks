class myStack3{
    private int top1,top2,cap;
    private int[] arr;

    myStack3(int n){
        top1 =-1;
        top2 = n;
        cap = n;
        arr = new int[n];
    }

    public void push1(int x){
        if(top1<top2-1){
            top1++;
            arr[top1] = x;
        }
        else System.out.println("Stack overflow");
    }

    public void push2(int x){
        if(top1<top2-1){
            top2--;
            arr[top2] = x;
        }
        else System.out.println("Stack oerflow");
    }

    public int pop1(){
        if(top1!=-1){
            int a = arr[top1];
            top1--;
            return a;
        }
        else
            return top1;
    }

    public int pop2(){
        if(top2!=cap){
            int a = arr[top2];
            top2++;
            return a;
        }
        else
            return top2;
    }

    public int size1(){
        return top1+1;
    }

    public int size2(){
        return cap-top1-1;
    }
}

public class Impl2StackInArray {

    public static void main(String[] args){
        myStack3 ms3 = new myStack3(5);
        ms3.push1(3);
        ms3.push1(6);
        ms3.push2(12);
        ms3.push1(56);
        ms3.push2(23);
        ms3.push1(33);
        System.out.println(ms3.size1());
        System.out.println(ms3.size2());
    }
}
