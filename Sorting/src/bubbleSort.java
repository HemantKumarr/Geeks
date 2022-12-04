public class bubbleSort {
// stable algo - does not change order of equal elements,
// in-place algo -  does not require any extra array to store the original elements
//    after every iteration largest value is placed at its correct value
    public static void main(String[] args){
        int[] a ={12,5,7,8,13,2};
        boolean swapped=false;   //optimization when the elements being compared are already sorted
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {   //loop runs till a.length-1-i because we are comparing to j+1 and in every iteration largest element is placed at last position.
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
