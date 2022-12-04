public class occurfirst {

    public static void main(String[] args){
        int[] a={2,5,7,7,7,7,7,7,7,7,9,12,12,12,12,16,16,20};
        int low=0,high =a.length-1,mid,x=7;
        while(low<=high){
            mid=(low+high)/2;
//            System.out.println(high);
            if(a[mid]==x){
//                System.out.println(mid);
                if ((mid-1)>=0&&a[mid - 1] == x)
                    high = mid - 1;
                else {
                    System.out.println(mid);
                    break;
                }
            }
            else if(a[mid]<x) low=mid+1;
            else high=mid-1;
        }
        System.out.println(-1);
    }
}
