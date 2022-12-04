public class sort2diffTypeArr {

    public static void main(String[] args){
        int[] a ={3,5,7,2,4,6,1,8};
        int low=-1,high=a.length;
        while (true){
            do{
                low++;
            }while (a[low]%2==0);  // enter the condition here if we want to sort array into +ve n -ve or 0's n 1's
            do{
                high--;
            }while (a[high]%2!=0);
            if(low>=high) break;
            int temp=a[high];
            a[high]=a[low];
            a[low]=temp;
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
        lomuto(a);
    }

    private static void lomuto(int[] a) {
        int pivot=a[a.length-1];
        int i =-1;
        for (int j = 0; j <a.length ; j++) {
            if(a[j]%2==0){
                i++;
                int temp = a[j];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp = a[a.length-1];
        a[a.length-1]=a[i+1];
        a[i+1] = temp;
        System.out.println("----");
        for (int j = 0; j <a.length ; j++) {
            System.out.println(a[j]);
        }
    }
}
