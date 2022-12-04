public class occurlast {

    public static void main(String[] args){
        int[] a= {2,3,3,3,4,4,7,8,9,};
        int low=0,high=a.length-1,mid,x=4;
        boolean flag=false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == x) {
                if ((mid+1)<=a.length-1 && a[mid + 1] == x)
                    low = mid + 1;
                else {
                    flag=true;
                    System.out.println(mid);
                    break;
                }
            } else if (a[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        if(!flag)    System.out.println(-1);
    }
}
