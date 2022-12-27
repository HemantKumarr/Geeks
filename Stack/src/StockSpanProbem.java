import java.util.ArrayDeque;

public class StockSpanProbem {

    public static void main(String[] args) {
        int[] arr = {60, 10, 20, 40, 35, 30, 50, 70, 65};
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(0);
        System.out.print(1 + " ");

        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) System.out.print(i + 1 + " ");
            else System.out.print(i - s.peek() + " ");
            s.push(i);
        }
    }
}
