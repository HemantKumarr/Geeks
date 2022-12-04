public class quicksortHoarePartition {

    public static void main(String[] args ){
        int[] a = {4,1,7,9,6,10,11,2};
        quisort(a,0,a.length-1);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }

    private static void quisort(int[] a, int l, int h) {
        if(l<h){
            int p = hoarePartition(a,l,h);
            quisort(a,l,p);
            quisort(a,p+1,h);
        }
    }

    private static int hoarePartition(int[] a, int low, int high) {
        int pivot = a[low],i=low-1,j=high+1;
        while(true){
            do{
                i++;
            }while (a[i]<pivot);
            do {
                j--;
            }while (a[j]>pivot);
            if(i>=j) return j;
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}
