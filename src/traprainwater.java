import static java.lang.Integer.min;
import static java.lang.Math.max;

public class traprainwater {

    public static void main(String[] args){
        int[] a={5,0,6,2,3};
        int[] lmax = new int[a.length];
        int res=0;
        lmax[0]=a[0];
        for (int i = 1; i < a.length; i++) {
            lmax[i]=max(lmax[i-1],a[i]);
        }
        int[] rmax = new int[a.length];
        rmax[a.length-1]=a[a.length-1];
        for (int i = a.length-2; i >=0 ; i--) {
            rmax[i]=max(rmax[i+1],a[i]);
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(lmax[i]+ " " + rmax[i]);
        }
        for (int i = 1; i <a.length ; i++) {
            res+= min(lmax[i],rmax[i])-a[i];
        }
        System.out.println(res);
    }
}
