import java.util.Arrays;

import static java.lang.Integer.min;
import static java.lang.Math.abs;

public class mindiff {

    public static void main(String[] args){
        int res=Integer.MAX_VALUE;
        int[] a = {7,3,9,2,0,-1};
        Arrays.sort(a);
        for (int i = 1; i <a.length ; i++) {
             res =min(res, abs(a[i]-a[i-1]));
        }
        System.out.println(res);
    }
}
