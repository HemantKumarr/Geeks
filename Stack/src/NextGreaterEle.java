import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class NextGreaterEle {

    public static void main(String[] args){
        int[] arr = {5,15,10,8,6,12,9,18};
        int n = arr.length;
        ArrayDeque<Integer> s = new ArrayDeque<>();
        ArrayList<Integer> al = new ArrayList<>();
        s.push(n-1);
        al.add(n-1);
        System.out.print(-1 + " ");

// the output is printed in reversed order
// takes least time when array is sorted in decreasing order. output will be -1 for each element.

        for (int i = n-2; i >=0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                System.out.print(-1 + " ");
                al.add(-1);
            }
            else{
                System.out.print(arr[s.peek()] + " ");
                al.add(arr[s.peek()]);
            }
            s.push(i);
        }
        System.out.println();
        Collections.reverse(al);
        for (int x: al) {
            System.out.print(x + " ");
        }
    }
}
