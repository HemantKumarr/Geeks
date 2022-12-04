import java.util.ArrayList;

public class union2sortarr {

    public static void main(String[] args){
        int[] a = {3,6,8,9,12};
        int[] b = {1,4,5,7,8,12};
        int n = a.length+b.length;
        ArrayList<Integer> c = new ArrayList<Integer>();
//        int[] c = new int[n];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                c.add(a[i]);
//                c[k]=a[i];
                i++;
                j++;
                k++;
            }
            else if(a[i]<b[j]){
                c.add(a[i]);
//                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c.add(b[j]);
//                c[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            c.add(a[i]);
//            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c.add(b[j]);
//            c[k]=b[j];
            j++;
            k++;
        }
        for (int l = 0; l <c.size() ; l++) {
            System.out.println(c.get(l));
        }
    }
}
