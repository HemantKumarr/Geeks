public class palindrome {

    public static void main(String[] args){
        String str = "RADDAR";
        boolean flag =true;
        int end = str.length()-1,begin=0;
        while(begin<end){
            if(str.charAt(begin)!= str.charAt(end)) {
                flag=false;
                System.out.println(false);
                break;
            }
            begin++;
            end--;
        }
        if(flag) System.out.println("Palindrome");
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        System.out.println(str.equals(rev.toString()));

    }
}
