public class subsequence {

    public static void main(String[] args){
        String s1 = "GeeksForGeeks";
        String s2 = "GFks";
        int i=0,j=0;
        for ( i = 0,j=0;j <s2.length() &&i<s1.length(); i++) {
            if(s1.charAt(i)==s2.charAt(j))j++;
        }
        if(j==s2.length()) System.out.println("true");

        boolean b = recursive(s1,s2,s1.length(),s2.length());
        System.out.println(b);
    }

    private static boolean recursive(String s1, String s2, int s1len, int s2len) {
        if(s2len==0) return true;
        if(s1len==0) return false;
        if(s1.charAt(s1len-1)==s2.charAt(s2len-1)) return recursive(s1,s2,s1len-1,s2len-1);
        else return recursive(s1,s2,s1len-1,s2len);
    }

}
