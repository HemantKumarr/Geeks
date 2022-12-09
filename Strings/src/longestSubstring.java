import java.util.Arrays;

import static java.lang.Math.max;

public class longestSubstring {

    public static void main(String[] args){
        String s1 = "abcadbd";
        int res=0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i; j <s1.length() ; j++) {
                if(areDistinct(s1,i,j)){
                    res = max(res,j-i+1);
                }
            }
        }
        System.out.println(res+ " ");
        better(s1);
        best(s1);
    }


    private static boolean areDistinct(String s1, int i, int j) {
        boolean[] visited = new boolean[256];
        Arrays.fill(visited,false);
        for (int k = i; k <=j ; k++) {
            if(visited[s1.charAt(k)]) return false;
            visited[s1.charAt(k)]=true;
        }
        return true;
    }

    private static void better(String s1) {
        int res=0;
        for (int i = 0; i < s1.length(); i++) {
            boolean[] visited = new boolean[128];
            for (int j = i; j <s1.length() ; j++) {
                if(visited[s1.charAt(j)])   break;
                else {
                    res = max(res, j - i + 1);
                    visited[s1.charAt(j)]=true;
                }
            }
        }
        System.out.println(res);
    }

    private static void best(String s1) {
        int[] prev = new int[256];
        Arrays.fill(prev,-1);
        int res=0;//,maxend;
        int i=0;
        for (int j = 0; j <s1.length() ; j++) {
            i = max(i,prev[s1.charAt(j)]+1);
            int maxend = j-i+1;
            res = max(res,maxend);
            prev[s1.charAt(j)]=j;

        }
        System.out.println(res);
    }

}
