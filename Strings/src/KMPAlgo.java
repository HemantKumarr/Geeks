public class KMPAlgo {

    public  static void main(String[] args){
        String text = "ABABCABABAAD"; // for non repeating chars in pattern, KMP algo is as good as naive.
//        in case of repeating chars, KMP algo pre-processes the pattern.
        String pat = "ABABA";
        int[] lps = new int[pat.length()];
        lps = optimize(pat,lps);
        int i=0,j=0;
        while (i<text.length()) {
            if(text.charAt(i)==pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == pat.length()) {
                System.out.println(i - j);
                j=lps[j-1];
            }
            else if(i<text.length()&& text.charAt(i)!=pat.charAt(j)){
                if(j==0) i++;
                else j=lps[j-1];

            }
        }
    }

    private static int[] optimize(String text, int[] lps) {
        lps[0]=0;
        int i=1,len=0;
        while (i<text.length()){
            if(text.charAt(i)==text.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else
            if(len==0){
                lps[i]=0;
                i++;
            }
            else{
                len=lps[len-1];
            }
        }
        return lps;
    }
}
