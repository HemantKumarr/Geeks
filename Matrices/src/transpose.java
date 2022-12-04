public class transpose {
    public static void main(String[] args){
        int[][] a = {{2,4,6,7},
                {3,1,8,2},
                {44,22,77,11},
                {50,20,10,30}};

        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a[i].length ; j++) {
                int temp =a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
