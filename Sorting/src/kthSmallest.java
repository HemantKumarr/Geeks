public class kthSmallest {

    public static void main(String[] args){
        int[] a = {3,7,5,9,10,12,6,2,0,7};
        int k = 3, low=0,high=a.length-1;
        while(low<=high){
            int p = lomuto(a,low,high);
            if(p==(k-1)) {
                System.out.println(a[p]);
                break;
            }
            else if(p>(k-1)) high=p-1;
            else low=p+1;
        }
    }

    private static int lomuto(int[] a, int l, int r) {
        int pivot = a[r];
        int i = l-1;
        for (int j = l; j < r; j++) {
            if (a[j] < pivot) {       // a[j] > pivot will give kth largest number
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int tem = a[r];
        a[r] = a[i + 1];
        a[i + 1] = tem;
//        for (int j = 0; j < a.length; j++) {
//            System.out.println(a[j]);
//        }
        return (i + 1);
    }
}
