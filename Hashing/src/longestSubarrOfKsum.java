import java.util.HashMap;
import static java.lang.Math.max;

public class longestSubarrOfKsum {

    public static void main(String[] args){
        Integer[] a = {3,5,2,2,2,2,9,3,2};
        int sum=8,res=0,prefix_sum=0;
        HashMap<Integer,Integer> h = new HashMap<Integer, Integer>();
        for (int i=0; i<a.length; i++) {
            prefix_sum+=a[i];
            if(prefix_sum==sum){
                res=i+1;
            }
            if(!h.containsKey(prefix_sum)){      //storing the 1st occurence of prefix_sum to find the longest sub array
                h.put(prefix_sum,i);
            }
            if(h.containsKey(prefix_sum-sum)){
                res = max(res, i-h.get(prefix_sum-sum));
            }
        }
        System.out.println(res);
        System.out.println("------------");
        naive(a,sum);
    }

    private static void naive(Integer[] a,int k) {
        int res=0;
        for (int i = 0; i <a.length ; i++) {
            int sum=0;
            for (int j = i; j <a.length ; j++) {
                sum += a[j];
                if(sum==k){
                    System.out.println(true);
                    res = max(res,j-i+1);
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
