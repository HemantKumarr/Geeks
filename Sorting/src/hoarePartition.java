import java.util.Scanner;

public class hoarePartition {
// much better than lomuto partition, in-stable algo

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i <n ; i++) {
//            a[i]=sc.nextInt();
//        }
        int []a = {6,3,8,1,0,2,11,7};
        int[] b= hoare(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(b[i]);
        }
    }

    private static int[] hoare(int[] a) {
        int pivot = a[0],i=-1,j=a.length;
        while(true){
            do{
                i++;
            }while (a[i]<pivot);
            do {
                j--;
            }while (a[j]>pivot);
            if(i>=j) return a;
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}
