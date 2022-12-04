public class selectionSort {
//    O(n^2) time complexity, does less memory writes compared to quicksort, mergesort, insertion sort etc. But cycle sort
//    is best for least memory writes. Basic idea for heapsort. Not stable, in-Place
//    after every iteration smallest value is placed at their correct position and their actual position is filled with max value
    public static void main(String[] args){
        int[] a= {5,2,7,1,0,7,45,32};
        naive(a);
        int[] b = {5,2,7,1,0,7,45,32};
        optimize(b);
    }

    private static void naive(int[] a) {
        int n=a.length;
        int[] temp=new int[n];
        for (int i = 0; i <n ; i++) {
            int min_ind=0;
            for (int j = 1; j <n ; j++) {
                if (a[j] < a[min_ind])
                    min_ind = j;
            }
            temp[i]=a[min_ind];
            a[min_ind]=32768;
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(temp[i]);
        }
    }

    private static void optimize(int[] a) {
        int n=a.length;
        for (int i = 0; i <n-1 ; i++) {
            int min_ind=i;
            for (int j = i+1; j <n ; j++) {
                if (a[j] < a[min_ind])
                    min_ind = j;
            }
            int temp = a[i];
            a[i]=a[min_ind];
            a[min_ind]=temp;
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(a[i]);
        }
    }
}
