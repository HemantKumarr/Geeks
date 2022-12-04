import java.util.Scanner;

public class remduplicate {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] a ={1,2,2,2,2,2,3,3,4,5,6};
        int size=1;
        for (int i = 1; i <a.length ; i++) {
            if(a[i]!=a[i-1]){
                a[size]=a[i];
                size++;
            }
        }
        for (int i = 0; i <size ; i++) {
            System.out.println(a[i]);
        }
    }
}
