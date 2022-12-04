public class boundaryTraversal {

    public static void main(String[] args){
        int[][] a = {{2,4,6,7},
                    {3,1,8,2},
                    {44,22,77,11},
                    {50,20,10,30}};
        int r = a.length,c=a[0].length;
        if(r==1){
            for (int i = 0; i <c ; i++) {
                System.out.println(a[0][i] + " ");
            }
        }
        else if(c==1){
            for (int i = 0; i <r ; i++) {
                System.out.println(a[i][0]+ " ");
            }
        }
        else{
            for (int i = 0; i <c ; i++) {
                System.out.print(a[0][i] + " ");
            }
            System.out.println();
            for (int i = 1; i <r ; i++) {
                System.out.print(a[i][c-1] + " ");
            }
            System.out.println();
            for (int i = c-2; i >=0 ; i--) {
                System.out.print(a[r-1][i]+ " ");
            }
            System.out.println();
            for (int i = r-2; i >=1 ; i--) {
                System.out.print(a[i][0] + " ");
            }
        }

    }
}
