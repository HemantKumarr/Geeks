import java.util.Arrays;

import static java.lang.Integer.min;

public class leftmostNonrepeating {
    public static void main(String[] args){
        String s = "adbcaecdb";
        naive(s);
        better(s);
        optimize(s);
    }

    private static void naive(String s) {
        System.out.println(("In naive"));
        int i=0;
        for (i = 0; i <s.length() ; i++) {
            boolean flag=true;
            for (int j = 0; j <s.length() ; j++) {
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag) break;
        }
        System.out.println(s.charAt(i));
    }

    private static void better(String s) {
        System.out.println(("In better"));
        int[] count = new int[256];
        for (int i = 0; i <s.length() ; i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i <s.length() ; i++) {
            if(count[s.charAt(i)]==1){
                System.out.println(s.charAt(i) + " true");
                break;
            }
        }
    }

    private static void optimize(String s) {
        System.out.println(("In optimize"));
        int[] fi = new int[256];
        Arrays.fill(fi,-1);
        for (int i = 0; i <s.length() ; i++) {
            if(fi[s.charAt(i)]==-1)
                fi[s.charAt(i)]=i;
            else
                fi[s.charAt(i)]=-2;
        }
        int res=Integer.MAX_VALUE;
        for (int i = 0; i <256 ; i++) {
            if(fi[i]>=0)
                res=min(res,fi[i]);
        }
        System.out.println(s.charAt(res));

    }
}
