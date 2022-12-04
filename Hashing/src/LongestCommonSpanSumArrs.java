import java.util.HashMap;

import static java.lang.Math.max;

public class LongestCommonSpanSumArrs {

    public static void main(String[] args){
        Integer[] a = {0,1,0,0,0,1,1,0,0,1,0};
        Integer[] b = {1,0,1,0,1,1,0,1,0,1,1};
        Integer[] temp = new Integer[a.length]; // values are initialized with null, int initializes value with 0

        for (int i = 0; i <a.length ; i++) {
            temp[i] = a[i] - b[i];
        }

        HashMap<Integer,Integer> h = new HashMap<Integer, Integer>();
        int prefix_sum=0, res=0;
        for (int i=0; i<a.length; i++) {
            prefix_sum+=temp[i];
            if(prefix_sum==0){
                res=i+1;
            }
            if(!h.containsKey(prefix_sum)){      //storing the 1st occurence of prefix_sum to find the longest sub array
                h.put(prefix_sum,i);
            }
            if(h.containsKey(prefix_sum)){
                res = max(res, i-h.get(prefix_sum));
            }
        }
        System.out.println(res);
        System.out.println("--------------");
        naive(a,b);
    }

    private static void naive(Integer[] a, Integer[] b) {
        int res=0;
        for (int i = 0; i <a.length ; i++) {
            int suma=0, sumb=0;
            for (int j = i; j <a.length ; j++) {
                suma+=a[j];
                sumb+=b[j];
                if(suma==sumb) res = max(res, j - i + 1);
            }
        }
        System.out.println(res);
    }
}
