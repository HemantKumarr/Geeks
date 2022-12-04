import java.util.Arrays;

import static java.lang.Integer.min;
import static java.lang.Math.abs;

public class chocolateDistri {

    public static void main(String[] args){
        int res=Integer.MAX_VALUE;
        int[] a = {7,3,1,8,9,12,56};
        Arrays.sort(a);
        for (int i = 2; i <a.length ; i++) {
            res =min(res, abs(a[i]-a[i-2]));
        }
        System.out.println(res);
    }
}
