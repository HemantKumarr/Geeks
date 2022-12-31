import java.util.ArrayDeque;

import static java.lang.Math.max;

public class LargeRectWith1s {
    public static void main(String[] args){

        int[][] mat = {{1,0,0,1},
                      {1,1,1,1},
                      {1,1,0,1},
                      {1,1,0,1}};

        int res = largeArea(mat[0]);
        int[] temp ;
        temp = mat[0];
        for (int j = 0; j < temp.length; j++) {
            System.out.print(temp[j] + " ");
        }
        System.out.println();
        for (int i = 1; i <mat.length; i++) {
            for (int j = 0; j < mat[i].length ; j++) {
                if(mat[i][j]==1){
                    temp[j] += mat[i][j];
                }
                else temp[j]=0;
            }
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j] + " ");
            }
            System.out.println();
            res = max(res, largeArea(temp));
        }
        System.out.println(res);
    }

    private static int largeArea(int[] arr) {
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
        return res;
    }
}
