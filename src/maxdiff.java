import static java.lang.Integer.min;
import static java.lang.Math.max;

public class maxdiff {
    public static void main(String[] args){
        int[] a={2,-1,6,1,8,0,12,5};
        int res=a[1]-a[0], mini=a[0];
        for (int i = 1; i <a.length ; i++) {
            res=max(res,a[i]-mini);
            mini=min(mini,a[i]);
        }
        System.out.println(res);
    }
}
