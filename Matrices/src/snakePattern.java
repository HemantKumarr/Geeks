public class snakePattern {

    public static void main(String[] args){
        int[][] a = {{2,4,6,7}, {3,1}, {44,22,77,11,1,2,3,4}, {50,20,10,30}};
        for (int i = 0; i < a.length; i++) {
            if(i%2==0){
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
            }
            else{
                for (int j = a[i].length-1; j >= 0 ; j--) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
