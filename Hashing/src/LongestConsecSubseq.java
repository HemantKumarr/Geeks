import java.util.Arrays;
import java.util.HashSet;

import static java.lang.Math.max;

public class LongestConsecSubseq {

    public static void main(String[] args){
        Integer[] a={2,4,1,3,6,7,9,10,13,12};
        int res=0;
        HashSet<Integer> h = new HashSet<>(Arrays.asList(a));
        for (int x:h  )
            if (!h.contains(x - 1)) {
                int curr = 1;
                while (h.contains(x + curr)) curr++;
                res = max(res, curr);
            }
        System.out.println(res);
        System.out.println("---------------------");
        naive(a);
    }

    private static void naive(Integer[] a) {
        Arrays.sort(a);
        int res=1,curr=1;
        for (int i = 1; i <a.length ; i++) {
            if(a[i]==a[i-1]+1){
                curr++;
            }
            else if(!a[i].equals(a[i-1])){
                res = max(res,curr);
                curr=1;
            }
        }
        System.out.println(res);
    }
}
