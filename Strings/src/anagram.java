public class anagram {

    public static void main(String[] args){
        String s1= "silent", s2="listen";
        int[] a = new int[256];
        boolean flag=true;
        if(s1.length()!=s2.length()) System.out.println("false");
        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i)]++;
            a[s2.charAt(i)]--;
        }
        for (int i = 0; i <256 ; i++) {
            if(a[i]!=0){
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }
}
