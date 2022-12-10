public class patternSearching {
    public static void main(String[] args){
        String text = "ABCEFSHFUJNHDSHFU";  //Improved naive algo for distinct pattern
        String pat = "SHFU";
        naive(text,pat);
        for (int i = 0; i <= text.length()-pat.length();) {
            int j;
            for (j = 0; j <pat.length() ; j++) {
                if(pat.charAt(j)!=text.charAt(i+j)) break;
            }
            if(j==pat.length()) System.out.println(i+ " ");
            if(j==0) i++;
            else
                i=i+j;
        }
    }

    private static void naive(String text, String pat) {
        for (int i = 0; i <= text.length()-pat.length(); i++) {
            boolean flag= true;
            for (int j = 0; j <pat.length(); j++) {
                if(pat.charAt(j)!=text.charAt(i+j)) flag=false;
            }
            if(flag) System.out.print(i+" ");
        }
    }
}
