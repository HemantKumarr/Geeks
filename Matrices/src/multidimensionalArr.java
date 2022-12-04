public class multidimensionalArr {

    public static void main(String[] args){
        int m=2,n=4;
        int[][] a = new int[m][n];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j]=j*3+i;  // by default, elements in a matrix are assigned to 0
            }
        }
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

//      with dimensions specified in the declaration
        int[][] b = new int[2][5];
        for (int i = 0; i <b.length ; i++) {
            for (int j = 0; j <b[i].length ; j++) {
                b[i][j]=j*3+i;
            }
        }
        for (int i = 0; i <b.length ; i++) {
            for (int j = 0; j <b[i].length ; j++) {
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }
//        with only one dimension in the declaration and other dimension dynamically assigned - jagged arrays
        int[][] c = new int[3][];
        for (int i = 0; i <c.length ; i++) {
            c[i] = new int[i+2];
            for (int j = 0; j <c[i].length ; j++) {
                c[i][j]=i*j;
            }
        }
        for (int i = 0; i <c.length ; i++) {
            for (int j = 0; j <c[i].length ; j++) {
                System.out.print(c[i][j] +" ");
            }
            System.out.println();
        }
    }
}
