import java.util.Arrays;

import static java.lang.Integer.min;

public class leftmostRepeating {

    public static void main(String[] args){
        String s = "adbccdb";
        naive(s);
        better(s);
        optimize(s);
        optimize2(s);  // small optimization over optimize function
    }

    private static void naive(String s) {
        System.out.println(("In naive"));
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <s.length() ; j++) {
                if(s.charAt(i)==s.charAt(j)){
                    System.out.println(s.charAt(i) + " "+ "true");
                    break;
                }
            }
        }
    }

    private static void better(String s) {
        System.out.println(("In better"));
        int[] count = new int[256];
        for (int i = 0; i <s.length() ; i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i <s.length() ; i++) {
            if(count[s.charAt(i)]>1){
                System.out.println(s.charAt(i) + " true");
                break;
            }
        }
    }

    private static void optimize(String s) {
        System.out.println(("In optimize"));
        int res=Integer.MAX_VALUE;
        int[] fi = new int[256];
        Arrays.fill(fi,-1);
        for (int i = 0; i <s.length() ; i++) {
            if(fi[s.charAt(i)]==-1)
                fi[s.charAt(i)]=i;
            else
                res=min(res,fi[s.charAt(i)]);
        }
        if(res!=Integer.MAX_VALUE) System.out.println(s.charAt(res)+ " true");
    }


    private static void optimize2(String s) {
        System.out.println(("In optimize2"));
        int res = Integer.MAX_VALUE;
        boolean[] b = new boolean[256];
        Arrays.fill(b,false);
        for (int i = s.length()-1; i >=0 ; i--) {
            if(!b[s.charAt(i)])b[s.charAt(i)]=true;
            else
                res=i;
        }
        System.out.println(s.charAt(res));
    }
}
