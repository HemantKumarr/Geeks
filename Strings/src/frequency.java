public class frequency {

    public static void main(String[] args){
        String s = "Geeksforgeeks";
        int[] a = new int[256];
        for (int i = 0; i <s.length() ; i++) {
            a[s.charAt(i)-'A']++;
        }
        for (int i = 0; i <256 ; i++) {
            if(a[i]>0){
                System.out.println((char)(i+'A') + " "+a[i]);
            }
        }
        String s1 = "geeks";
        String s2 =s1;
        s2=s1+"fgf";
        System.out.println(s1==s2);
        char x = 'a';
        int y=x;
        System.out.println(y);
    }
}
