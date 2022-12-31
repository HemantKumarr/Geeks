import java.util.ArrayDeque;

import static java.lang.Math.max;

public class LargeRectAreaHistogram2 {
    public static void main(String[] args){

        int[] arr = {6,2,5,4,1,5,6};
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int res=0,tp,curr = 0, temp=0,n=arr.length;

        for (int i = 0; i <arr.length ; i++) {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                tp = st.pop();
                temp = st.isEmpty()?i:(i-st.peek()-1);
                curr = arr[tp]* temp;
                res = max(res,curr);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            tp = st.pop();
            temp = st.isEmpty()?n:(n-st.peek()-1);
            curr = arr[tp]* temp;
            res = max(res,curr);
        }
        System.out.println(res);
    }
}
