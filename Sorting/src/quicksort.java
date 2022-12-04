public class quicksort {
//    here partition function is the key function just like merge function is in merge sort
//    divide n conquer algo, worst case O(n^2) still faster than merge sort because
//    in-place, cache friendly, tail recursive and average case is O(nlogn)
//    in-place does not use auxiliary array, however space is used in function call stack
//    quick sort using partition
//    1. naive partition - stable but not in place
//    2. lomuto parttion - unstable, but in place
//    3. hoare partition - unstable, but in-place - mostly used
//    merge sort is used when stability is needed

    public static void main(String[] args ){
        int[] a = {4,1,7,9,6,10,0,5};
        quisort(a,0,a.length-1);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }

    private static void quisort(int[] a, int l, int h) {
        if(l<h){
            int p = partition(a,l,h);
            quisort(a,l,p-1);
            quisort(a,p+1,h);
        }
    }

    private static int partition(int[] a, int low, int high) {
            int pivot=a[high];
            int i=low-1;
            for (int j = low; j <high ; j++) {
                if (a[j] < pivot) {
                    i++;
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            int tem = a[high];
            a[high]= a[i+1];
            a[i+1]=tem;
            return i+1;
        }
}
