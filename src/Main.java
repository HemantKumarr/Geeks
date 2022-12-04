import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 0; i <n+2 ; i++) {
            a.add(sc.nextInt());
        }
        int[] a1 = new int[5];
        System.out.println(a1[4]);

        for (int i = 0; i <n+2 ; i++) {
            System.out.println(a.get(i));
        }
        int p = a.get(2);
        System.out.println(a.size());
    }
}
