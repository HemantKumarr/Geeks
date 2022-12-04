public class squareroot {

    public static void main(String[] args){
        int x=63;
        int res = sqrt(x);
        System.out.println(res);
    }

    private static int sqrt(int x) {
        int low=0, high=x, res=-1,mid,msq;
        while(low<=high){
            mid=(low+high)/2;
            msq=mid*mid;
            if(msq==x) {
                return mid;
            }
            else if(msq>x) high=mid-1;
            else {
                low=mid+1;
                res=mid;
            }
        }
        return res;
    }
}
