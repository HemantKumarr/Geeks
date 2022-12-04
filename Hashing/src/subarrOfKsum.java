import java.util.HashSet;
import java.util.Set;

public class subarrOfKsum {

    public static void main(String[] args){
        Integer[] a = {3,5,1,7,9,3,2};
        int k=8;

        Set<Integer> h = new HashSet<Integer>();
        int prefix_sum=0;
        for (int i = 0; i < a.length; i++) {
            prefix_sum+=a[i];
            if(prefix_sum==k) {
                System.out.println(true);
                break;
            }
            if(h.contains(prefix_sum-k)) {
                System.out.println(prefix_sum);
                System.out.println(true);
                break;
            }
            h.add(prefix_sum);
        }
        System.out.println("-----------------");
        naive(a,k);
    }

    private static void naive(Integer[] a,int k) {
        for (int i = 0; i <a.length ; i++) {
            int sum=0;
            for (int j = i; j <a.length ; j++) {
                sum+=a[j];
                if(sum==k){
                    System.out.println(true);
                    break;
                }
            }
        }
    }
}
