public class equilibriumpoint {

    public static void main(String[] args){
        int[] a = {-4,4,2,2};
        int sum=0,s=0,e=0,curr_sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];
        }
        for (int i = 0; i <a.length ; i++) {
            curr_sum+=a[e];
            if(sum-curr_sum==curr_sum) {
                System.out.println("true");
                break;
            }
            else if(curr_sum>sum) {
                curr_sum-= a[s];
                s++;
            }
            else if(curr_sum<sum)
            { e++;
            }
            else
                System.out.println("false");

        }
    }
}
