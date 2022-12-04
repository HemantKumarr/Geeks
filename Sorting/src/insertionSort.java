public class insertionSort {
// O(n^2) worst case time complexity (when array is reverse sorted), O(n) is best case(when array is sorted)
// IN-place and stable, popular and efficient for small sized arrays (used by tim sort and intro sort
//    array till index i-1 is sorted
    public static void main(String[] args){
        int[] a = {2,5,6,3,34,22,10,1,8};
        for (int i = 1; i <a.length ; i++) {
            for (int j = 0; j < i; j++) {
                if(a[j]>a[i]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
