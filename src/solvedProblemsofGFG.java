import java.util.Arrays;

public class solvedProblemsofGFG {


//    FOr median n mean

    public int median(int A[],int N)
    {

        Arrays.sort(A);
        if(N%2==0){
            int s = (A[N/2]+A[(N/2)-1])/2;
            return (s);
        }
        else{
            return A[(N/2)];}
        //Your code here
        //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
        int s=0;
        for(int i=0;i<N;i++){
            s+=A[i];
        }
        return (s/N);
    }
//System.out.print(arr[i] + " "); to print with the space.

}
