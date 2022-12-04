import java.util.Vector;

public class dupelements {
    public static void main(String[] args){
        int[] a= {0,1,1,2,3};
        Vector<Boolean> v = new Vector<>(5);
//        v.add(false);
        System.out.println(v.capacity()); // v.size() = 0, v.capacity()=5
        for (int i = 0; i<v.capacity() ; i++) {
            v.add(i,false);
        }
        System.out.println(v.size()); //// v.size() = 5, v.capacity()=5
        for (int x:a ) {
            if (!v.get(x)) {
                v.add(x, true);
            }
            else {
                System.out.println(x);
                break;
            }
        }


    }
}
