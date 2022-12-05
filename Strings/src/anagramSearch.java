public class anagramSearch {

    public static void main(String[] args){
        String s1 = "geeksforgeeks";
        String s2 = "frog";
        naive(s1,s2);
        optimize(s1,s2);
    }

    private static void naive(String s1, String s2) {
        int m = s1.length(),n=s2.length(),i=0;
        boolean b=false;
        for ( i = 0; i < m-n; i++) {
            if(checkAnagram(s1,s2,i)){
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean checkAnagram(String s1, String s2, int i) {
        int[] count = new int[256];
        for (int j = 0; j <s2.length(); j++) {
            count[s1.charAt(i+j)]++;
            count[s2.charAt(j)]--;
        }
        for (int j = 0; j <256 ; j++) {
            if(count[j]!=0) return false;
        }
        return true;
    }

    private static void optimize(String s1, String s2) {
        int[] count1 = new int[256];
        int[] count2 = new int[256];
        for (int i = 0; i <s2.length() ; i++) {
            count1[s1.charAt(i)]++;
            count2[s2.charAt(i)]++;
        }
        for (int i = s2.length(); i < s1.length(); i++) {
            if(areSame(count1, count2)){
                System.out.println(true + " " + (i-s2.length()));
                break;
            }
            count1[s1.charAt(i)]++;
            count1[s1.charAt(i-s2.length())]--;
        }
    }

    private static boolean areSame(int[] count1, int[] count2) {
        for (int i = 0; i < 256 ; i++) {
            if(count1[i]!=count2[i]) return false;
        }
        return true;
    }
}
