import java.util.Scanner;

public class lexicographicRank {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1 = sc.nextLine();
        int[] count = new int[256];
        for (int i = 0; i <s1.length() ; i++) {
            count[s1.charAt(i)]++;
        }
        for (int i = 1; i <256 ; i++) {
            count[i] += count[i-1];
        }
        int mul = fact(s1.length());

        int res=1;
        for (int i = 0; i <s1.length() ; i++) {
            mul = mul/(s1.length()-i);
            res = res + count[s1.charAt(i)-1]*mul;
            for (int j = s1.charAt(i); j <256 ; j++) {
                count[j]--;
            }
        }
        System.out.println(res);
    }

    private static int fact(int length) {
        int product =1;
        for (int i = 1; i <=length ; i++) {
            product*=i;
        }
        return product;
    }
}
