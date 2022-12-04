public class searchInRotatedSorted {

    public static void main(String[] args){
        int[] a={10,20,30,40,50,2,3,4,6,7,8};
        int x=40,low=0,high=a.length-1,mid;
        while (low<=high){
            mid=(low+high)/2;
            if(a[mid]==x) {
                System.out.println(mid);
                break;
            }
            else if(a[low]<a[mid]){
                if(x>=a[low]&&x<=a[mid]) high=mid-1;
                else
                    low=mid+1;
            }
            else{
                if(x>=a[mid]&&x<=a[high]) low=mid+1;
                else
                    high=mid-1;
            }
        }
    }
}
