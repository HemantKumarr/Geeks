public class occurof1s {

    public static void main(String[] args){
        int[] a= {0,0,0,1,1,1,1};
        int x=1;
        int first =  firstoccur(a, x);
        System.out.println(a.length-first);

        int low=0,high=a.length-1,mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if(a[mid]==0) low=mid+1;
            else{
                if(mid==0||a[mid-1]==0) {
                    System.out.println(a.length-mid);
                    break;
                }
                else
                    high=mid-1;
            }
        }
    }

    private static int firstoccur(int[] a, int x) {
        int low=0,high=a.length-1,mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == x) {
                if ((mid-1)>=0&&a[mid - 1] == x)
                    high = mid - 1;
                else {
                    return mid;
                }
            } else if (a[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
