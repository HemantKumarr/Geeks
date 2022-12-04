import java.util.Scanner;

public class revarray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a ={2,3,3,4,5,9};
        int low=0,high=a.length-1;
        while(low<high){
            a[low]=a[low]+a[high];
            a[high]=a[low]-a[high];
            a[low]=a[low]-a[high];
            low++;
            high--;
        }
        for (int k = 0; k <a.length ; k++) {
            System.out.println(a[k]);
        }
    }
}
