public class searchInRownColumnSorted2dArr {

    public static void main(String[] args) {
        int[][] a = {{3,  4,  6,  7},
                    {5,  10, 12, 19},
                    {8,  22, 25, 28},
                    {11, 28, 30, 30}};
        int top=0,left=a[0].length-1,k=11;
        while (top<a.length && left>=0){
            if(a[top][left]==k){
                System.out.println(a[top][left]);
                break;
            }
            else if(a[top][left]<k) top++;
            else left--;
        }
    }
}
