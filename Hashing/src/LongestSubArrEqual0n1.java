import java.util.HashMap;

import static java.lang.Math.max;

public class LongestSubArrEqual0n1 {

    public static void main(String[] args){
        Integer[] a = {1,0,1,1,1,0,0};

        naive(a);
        System.out.println("----------");

        int prefix_sum=0, res=0;
        HashMap<Integer,Integer> h = new HashMap<Integer, Integer>();
        for (int i=0; i<a.length; i++) {

            int p=1;
            if(a[i]==0) p=-1;

            prefix_sum+=p;
            if(prefix_sum==0){
                res=i+1;
            }
            if(!h.containsKey(prefix_sum)){      //storing the 1st occurrence of prefix_sum to find the longest sub array with 0 sum
                h.put(prefix_sum,i);
            }
            if(h.containsKey(prefix_sum)){
                res = max(res, i-h.get(prefix_sum));
            }
        }
        System.out.println(res);
    }

    private static void naive(Integer[] a) {
        int res=0;
        for (int i = 0; i <a.length ; i++) {
            int count0=0,count1=0;
            for (int j = i; j <a.length ; j++) {
                if(a[j]==0) count0++;
                else count1++;
                if(count0==count1){
                    res=max(res,j-i+1);
                }
            }
        }
        System.out.println(res);
    }
}
