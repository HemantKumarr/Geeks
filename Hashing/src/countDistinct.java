import java.util.Arrays;
import java.util.HashSet;

public class countDistinct {
    public static void main(String[] args){
        Integer[] a = {2,5,5,1,1,4,4}; // datatype is not primitive int, but object Integer
        HashSet<Integer> h1 = new HashSet<Integer>(Arrays.asList(a));
        System.out.println(h1.size());
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i <a.length ; i++) {
            h.add(a[i]);
        }
        System.out.println(h.size());

//        naive implementation

        int res=0;
        for (int i = 0; i <a.length ; i++) {
            boolean flag = false;
            for (int j = 0; j <i ; j++) {
                if(a[i]==a[j]){
                    flag=true;
                    break;
                }
            }
            if (!flag){
                res++;
            }
        }
        System.out.println(res);


    }
}
