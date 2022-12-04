import java.util.HashSet;

public class intersection2arr {

    public static void main(String[] args){
        int[] a = {2,5,7,7,5,3,5};
        int[] b = {2,3,5,5,9,0};
        HashSet<Integer> h = new HashSet<>();
        for (int x:a ) {
            h.add(x);
        }
        for (int x:b ) {
            if(h.contains(x)){
                System.out.println(x);
                h.remove(x);  // to get distinct common elements, else duplicate element in both the array will appear twice
            }
        }
        System.out.println("--------------");
        naive(a,b);
    }

    private static void naive(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j <i ; j++) {
                if(a[i]==a[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==true) continue;
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j]){
                    System.out.println(b[j] );
                    break;
                }
            }
        }
    }
}
