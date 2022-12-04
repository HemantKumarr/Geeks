import java.util.Scanner;

public class sumofpair {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=sc.nextInt();
        int[] a={1,3,5,6,7,9,11,14,23,27,36,57};

        int s=0,e=a.length-1;
        while(s<=e){
            if(a[s]+a[e]==sum){
                System.out.println("true");
                break;
            }
            else if(a[s]+a[e]>sum) e--;
            else s++;
        }
    }
}
