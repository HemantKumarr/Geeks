import java.util.ArrayDeque;

public class PreviousGreaterEle {

    public static void main(String[] args){
        int[] arr = {15,10,18,12,4,6,2,8};
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(0);
        System.out.print(-1 + " ");
// takes least time when array is sorted in increasing order. output will be -1 for each element.
        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) System.out.print(-1 + " ");
            else System.out.print(arr[s.peek()] + " ");
            s.push(i);
        }
    }
}
