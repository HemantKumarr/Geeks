public class passing2DarrasArgs {

    public static void main(String[] args){
        int[][] a = {{2,4,6,8},
                {1,43,6,7,0}};
        argspass(a);
    }

    private static void argspass(int[][] a) {
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
