import static java.lang.Math.max;

public class maxsumsubarr {

    public static void main(String[] args){
        int[] a = {-3,8,-2,4,-5,6};
        int sum=a[0],res=a[0];
        for (int i = 1; i <a.length ; i++) {
            sum= max(sum+a[i],a[i]);
            res=max(res,sum);
        }
        System.out.println(res);
    }
}
// -11,7,8