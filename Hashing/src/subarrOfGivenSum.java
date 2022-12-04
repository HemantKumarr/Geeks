import java.util.HashSet;

public class subarrOfGivenSum {

    public static void main(String[] args){
        int[] a = {6,11,5,5};
        int sum = 10;
        HashSet<Integer> h = new HashSet<>();
        for (int x:a ) {
            if(h.contains(sum-x)){
                System.out.println(true);
                break;
            }
            h.add(x);
        }
    }
}
