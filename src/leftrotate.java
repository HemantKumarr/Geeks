public class leftrotate {

    public static void main(String[] args){
        int[] a ={1,2,3,4,5};
        rotate(a,4);// to left rotate array 4 times. Another way is to call left rotate by 1 method 4 times. this method stores 1st element in temp variable and then puts at last index.
    }

    private static void rotate(int[] a, int i) {
        a=reverse(a,0,i-1);
        a=reverse(a,i,a.length-1);
        a=reverse(a,0,a.length-1);

        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }

    private static int[] reverse(int[] a, int low, int high) {
        while (low<high){
            int temp;
            temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }

        return a;
    }
}
