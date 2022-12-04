public class spiralTraversal {

    public static void main(String[] args) {
        int[][] a = {{2, 4, 6,  7},
                    {3,  1, 8,  19},
                    {44, 22, 77, 11},
                    {50, 20, 10, 30}};
        int top = 0, right = a[0].length - 1, bottom = a.length - 1, left = 0;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;
            System.out.println();
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;
            System.out.println();
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }
            System.out.println();
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
            System.out.println();
        }
    }
}
