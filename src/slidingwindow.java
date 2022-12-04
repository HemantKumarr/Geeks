import static java.lang.Math.max;

public class slidingwindow {

    public static void main(String[] args){
        int[] a={1,3,-5,3,8,0,-2,9};
        int k=3,sum=0,res=0;
        for (int i = 0; i <k ; i++) {
            sum+=a[i];
        }
        res=sum;
        for (int i = k; i <a.length ; i++) {
            sum=sum+a[i]-a[i-k];
            res=max(sum,res);
        }
        System.out.println(res);
    }
}
