public class anagramSearch {

    public static void main(String[] args){
        String s1 = "geeksforgeeks";
        String s2 = "frog";
        naive(s1,s2);
    }

    private static void naive(String s1, String s2) {
        int m = s1.length(),n=s2.length(),i=0;
        boolean b=false;
        for ( i = 0; i < m-n; i++) {
            b = checkAnagram(s1,s2,i);
        }
        if(b) System.out.println(i);
    }

    private static boolean checkAnagram(String s1, String s2, int i) {
        int[] count = new int[256];
        for (int j = 0; j <s2.length() ; j++) {
            count[s1.charAt(i+j)]++;
            count[s2.charAt(j)]--;
        }
        for (int j = 0; j <256 ; j++) {
            if(count[j]!=0) return false;
        }
        return true;
    }
}
