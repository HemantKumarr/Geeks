public class lomutoPartition {
// if array needs to be partitioned by some element at index p which is not the last element, then the element
// at index p can be swapped with element at last index and then standard lomuto algo can be applied.
//  Standard lomuto algo partitions the array based on the element at last index.
//    not stable algo
    public static void main(String[] args){
        int []a = {6,3,8,1,0,2,11,5,4};
        int pivot=a[a.length-1];
        int i=-1;
        for (int j = 0; j <a.length ; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int tem = a[a.length-1];
        a[a.length-1]= a[i+1];
        a[i+1]=tem;
        for (int j = 0; j <a.length ; j++) {
            System.out.println(a[j]);
        }
//        System.out.println(i+1);
    }
}
