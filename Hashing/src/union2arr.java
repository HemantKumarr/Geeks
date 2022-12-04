import java.util.HashSet;

public class union2arr {

    public static void main(String[] args) {
        int[] a = {2, 5, 7, 7, 5, 3, 5,17};
        int[] b = {2, 3, 5, 5, 9, 0,12};
        HashSet<Integer> h = new HashSet<>();
        for (int x : a) {
            h.add(x);
        }
        for (int x : b) {
                h.add(x);
        }
        for (int x:h ) {
            System.out.println(x);
        }
    }
}
