public class Rotation {

    public static void main(String[] args){
        String s1 = "adcb";
        String s2 = "cbad";
        if(s1.length()!=s2.length()) System.out.println(false);
        System.out.println((s1+s1).indexOf(s2));
    }
}
