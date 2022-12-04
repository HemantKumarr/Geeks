import java.util.HashSet;

public class subarrOf0sum {

    public static void main(String[] args){
        Integer[] a = {2,4,-4,1,7,3,-2,8};
        HashSet<Integer> h = new HashSet<Integer>();
        int prefix_sum=0;
        for (int i = 0; i < a.length; i++) {
            prefix_sum+=a[i];

            if(prefix_sum==0) {
                System.out.println(true);
                break;
            }
            if(h.contains(prefix_sum)) {
                System.out.println(true);
                break;
            }
            h.add(prefix_sum);
        }
        naive(a);
    }

    private static void naive(Integer[] a) {
        for (int i = 0; i <a.length ; i++) {
            int sum=0;
            for (int j = i; j <a.length ; j++) {
                sum+=a[j];
                if(sum==0){
                    System.out.println(true);
                    break;
                }
            }
        }
    }
}
