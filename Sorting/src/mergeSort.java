public class mergeSort {
// stable not in-place, divide n conquer algo, quicksort out performs merge sort for arrays, however merge sort is widely used by many standard libraries
// merge sort well suited for lists and linked list sorting
// time complexity - theta(nlog n) which is the best possible time
// used in external sorting - parts of input can be brought and sorted
    
    public static void main(String[] args){
        int[] a = {5,7,3,1,0,8,11,17,6};
        int l=0, r=a.length-1;
        MergeSort(a,l,r);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }

    private static void merge(int[] a, int l, int mid, int r) {
        int n1=mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i <n1 ; i++) {
            left[i] = a[l+i];
        }
        for (int i = 0; i <n2 ; i++) {
            right[i] = a[mid+i+1];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                a[k]=left[i];
                i++;
            }
            else{
                a[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=right[j];
            j++;
            k++;
        }
    }

    private static void MergeSort(int[] a, int l, int r) {
        if(r>l){
            int mid = l + (r-l)/2;
            MergeSort(a,l,mid);
            MergeSort(a,mid+1,r);
            merge(a,l,mid,r);
        }
    }
}
