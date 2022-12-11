public class LPS {

    public static void main(String[] args){
        String text = "ABABACAB";
        int[] lps = new int[text.length()];
        for (int i = 0; i <text.length() ; i++) {
            lps[i] = longPropPreSuff(text,i+1);
        }
        for (int i = 0; i <lps.length ; i++) {
            System.out.println(lps[i]);
        }
        optimize(text);
    }

    private static int longPropPreSuff(String text, int n) {
        for (int len = n-1; len >0 ; len--) {
            boolean flag = true;
            for (int i = 0; i <len ; i++) {
                if(text.charAt(i)!=text.charAt(n-len+i)) flag = false;
            }
            if(flag) return len;
        }
        return 0;
    }

    private static void optimize(String text) {
        int[] lps = new int[text.length()];
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
        for (int j = 0; j <text.length() ; j++) {
            System.out.print(lps[j]);
        }
    }
}
