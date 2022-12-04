import static java.lang.Math.max;

public class maxconsec1s {

    public static void main(String[]  args){
        int[] a={0,0,1,1,1,0,1,1,0,0,0,1,1,1,1,1,1,0};
        int res=0,count=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==1){
                count++;
                res=max(res,count);
            }
            else {
                count = 0;
            }
        }

        System.out.println(res);
    }
}
