import java.util.ArrayList;

public class prefixsum {

    public static void main(String[] args){
        getsum(2,5);
        getsum(0,4);
        getsum(2,3);
    }

    private static void getsum(int l, int r) {
        int []a = {2,5,1,6,9,3,0,5};
        int[] b = new int[a.length];
        b[0]=a[0];
        for (int i =1; i <a.length ; i++) {
            b[i]=b[i-1]+a[i];
        }
        if(l==0) System.out.println(b[r]);
        else System.out.println(b[r]-b[l-1]);
    }
}
