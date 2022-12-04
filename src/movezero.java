import java.util.Scanner;

public class movezero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = {0,0,3,0,0,5,0,6,7,2,0,0};
        int count=0;
        for (int i = 0; i <a.length-1 ; i++) {
            if(a[i]!=0){
//                int temp=a[i];
//                a[i]=a[count];
//                a[count]=temp;
                a = swap(a,i,count);
                count++;
            }
        }
        for (int i = 0; i <count ; i++) {
            System.out.println(a[i]);
        }
    }

    private static int[] swap(int[] a,int i, int i1) {
        int temp = a[i];
        a[i]=a[i1];
        a[i1]=temp;
        return a;
    }
}
