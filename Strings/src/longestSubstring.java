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
        System.out.println(res);
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
}
