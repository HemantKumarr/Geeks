import java.util.Scanner;

public class largest2nd {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = {20,20,20};//,-7,0,68,300};
        int large2,large;
        seclarge(a);
        if(a[0]<a[1]){
            large2=a[0];
            large=a[1];
        }
        else{
            large2=a[1];
            large=a[0];
        }

        for (int i = 2; i < a.length; i++) {
            if(a[i]<=large2) continue;
            else if(a[i]> large2 && a[i]<large) large2=a[i];
            else {
                large2=large;
                large=a[i];
            }
        }
        System.out.println(large2);
    }

    private static void seclarge(int[] a) {
        int larg=0,res=-1;
        for (int i = 1; i <a.length ; i++) {
            if(a[i]>a[larg]){
                res=larg;
                larg=i;
            }
            else if(a[i]!=a[larg]){
                if(res==-1||a[i]>a[res]) res=i;
            }
        }
        System.out.println(res);
    }
}
