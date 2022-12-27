import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.max;

public class LargeRectAreaHistogram1 {
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,1,5,6};
        naive(arr);
        better(arr);
    }

    private static void naive(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j >= 0; j--) {
                if (arr[j] < arr[i]) break;
                curr += arr[i];
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) break;
                curr += arr[i];
            }
            res = max(res, curr);
        }
        System.out.println(res);
    }

    private static void better(int[] arr) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        int n = arr.length;
        s.push(0);
        int[] prevSmall = new int[n];
        prevSmall[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            int index = (s.isEmpty()) ? -1 : (s.peek());
            prevSmall[i] = index;  // will insert the index position of previous smaller element in the array.
//            if (index != -1) prevSmall[i] = arr[index];  -- to insert the previous smaller element in the array.
//            else prevSmall[i] = -1;
            s.push(i);
        }
        for (int x : prevSmall) {
            System.out.print(x + " ");
        }
        System.out.println();


        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(n - 1);
        int[] nextSmall = new int[n];
        nextSmall[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            int index = st.isEmpty() ? n : st.peek();
            nextSmall[i] = index;  // will insert the index position of next smaller element in the array.
//            if (index != -1) nextSmall[i] = arr[index]; -- to insert the next smaller element in the array.
//            else nextSmall[i] = -1;
            st.push(i);
        }
        for (int x : nextSmall) {
            System.out.print(x + " ");
        }
        System.out.println();
        int res=0,curr=0;
        for (int i = 0; i < arr.length; i++) {
            curr=arr[i];
            curr += (i-prevSmall[i]-1)*arr[i];
            curr += (nextSmall[i]-i-1)*arr[i];
            res = max(res,curr);
        }
        System.out.println(res);
    }
}

