public class countInversion {

    public static void main(String[] args) {
        int[] a = {2,5,8,11,3,6,9,13};
        int l = 0, r = a.length - 1,sum;
        sum=MergeSort(a, l, r);
        System.out.println(sum);
    }

    private static int merge(int[] a, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = a[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = a[mid + i + 1];
        }
        int i = 0, j = 0, k = l, count = 0;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                a[k] = left[i];
                i++;
                k++;
            } else {
                a[k] = right[j];
                j++;
                k++;
                count+=n1-i;
            }
        }
        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
        return count;
    }
    private static int MergeSort(int[] a, int l, int r) {
        int res=0;
            if(r>l){
                int mid = l + (r-l)/2;
                res+=MergeSort(a,l,mid);
                res+=MergeSort(a,mid+1,r);
                res+=merge(a,l,mid,r);
            }
            return res;
        }
    }

