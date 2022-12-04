public class findinInfiniteArr {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,12,13,15,16,18,19,22,33,44,55,56,67,78,89,110,111,114,223};
        int x = 15, low = 0, high = 1, mid;
        if (a[low] == x) System.out.println(low);
        while (a[high] < x) {
            high *= 2;
        }
//        long long int
//        System.out.println(high);
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == x){
                System.out.println(mid);
                break;
            }
            else if (x > a[mid]) low = mid + 1;
            else
                high = mid - 1;
        }

    }
}