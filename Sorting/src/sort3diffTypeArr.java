public class sort3diffTypeArr {

    public static void main(String[] args){
        int []a = {0,1,2,0,2,1,1,2,0 };
        int low=0,mid=0, high=a.length-1;
// 0 to low-1 contains 0's, low to mid-1 contains 1's, mid to high contains unknowns and high+1 to last index contains 2's
        while (mid<=high){
            if(a[mid]==0){
                int temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1) mid++;
            else {
                int temp = a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--; // here mid++ is not done because a[high] can be 0 or 1.
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
