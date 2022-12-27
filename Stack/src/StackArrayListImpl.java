import java.util.ArrayList;

class myStack1{
    private int top, cap;
    private ArrayList<Integer> al ;

    myStack1(){
        top = -1;
        al = new ArrayList<>();
    }

    public void push(int ele){
        top++;
        al.add(ele);
    }
    public int peek(){
        return al.get(al.size()-1);
    }

    public int pop(){
        int a = al.get(al.size()-1);
        al.remove(al.size()-1);
        return a;
    }
    public int size(){
        return al.size();
    }

    public boolean isEmpty(){
        return al.isEmpty() ;
    }

    public void display(){
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
    }
}

public class StackArrayListImpl {

    public static void main(String[] args){
        myStack1 ms1 = new myStack1();
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
