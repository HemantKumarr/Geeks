public class peakelement {

    public static void main(String[] args){
        int[] a = {10,20,5,1,19,7};
        int low=0,high=a.length-1,mid;
        while (low<=high){
            mid=(low+high)/2;
            System.out.println(mid);

//  if(((mid==0)&&a[mid+1]<=a[mid])||((mid==a.length-1)&&(a[mid-1]<=a[mid]))){} - this will not work when peak element
//  (mid index value) value is other than the index 0 or length-1.

            if(((mid==0)||a[mid]>=a[mid-1])&&((mid==a.length-1)||(a[mid]>=a[mid+1]))){
                System.out.println(a[mid]);
                break;
            }
            if(mid>0&&a[mid-1]>=a[mid]) high=mid-1;
            else
                low=mid+1;
        }
    }
}
