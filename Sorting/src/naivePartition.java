public class naivePartition {
// stable algo
    public static void main(String[] args){
        int[] a ={5,2,7,1,8,4,6};
        int[] temp = new int[a.length];
        int p=5,index=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]<a[p]){
                temp[index]=a[i];
                index++;
            }
        }
        temp[index]=a[p];
        index++;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>a[p]){
                temp[index]=a[i];
                index++;
            }
        }
        for (int i = 0; i <temp.length ; i++) {
            System.out.println(temp[i]);
        }

    }
}
