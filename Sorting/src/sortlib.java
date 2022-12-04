import java.util.Arrays;

public class sortlib {

    public static void main(String[] args){
        int[] a={1,22,5,2,6,1,0,5,77,22,90,44};
        char[] b = {'s','E','e','c','a','Z','i'};
        Arrays.sort(a,4,8); // to sort array from 'fromindex' to 'endindex' -1
        Arrays.sort(b,1,4);   // endindex is not included
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
