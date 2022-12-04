import static java.lang.Math.max;

public class longestevenodd {

    public static void main(String[] args){
        int[] a={1,2,3,4,5,5,6,7,6,8,9};
        int res=1,count=1;
        for (int i = 1; i <a.length ; i++) {
            if((a[i-1]%2==0&&a[i]%2==1)||(a[i]%2==0&&a[i-1]%2==1)){
                count++;
                res=max(res,count);
            }
            else {
                count = 1;
            }
        }
        System.out.println(res);
    }
}
