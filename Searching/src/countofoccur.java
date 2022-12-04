public class countofoccur {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 9, 9,10,10};
        int x = 4;
        int first = firstoccur(a, x);
        int last = lastoccur(a,x);
        if(first!=-1)
        System.out.println(last-first+1);
        else
            System.out.println("element not found");
    }

    private static int lastoccur(int[] a, int x) {
        int low=0,high=a.length-1,mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == x) {
                if ((mid+1)<=a.length-1 && a[mid + 1] == x)
                    low = mid + 1;
                else {
                    return mid;
                }
            } else if (a[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
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
