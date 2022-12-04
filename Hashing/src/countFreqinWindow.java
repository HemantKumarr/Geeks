import java.util.HashMap;

public class countFreqinWindow {

    public static void main(String[] args){
        Integer[] a = {10,20,10,10,30,40,50};
        int k=4;
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i <k ; i++) {
            h.put(a[i], h.getOrDefault(a[i],0)+1);
        }

        System.out.println(h.size());

        for (int i = k; i <a.length ; i++) {
            h.put(a[i-k],h.get(a[i-k])-1);
            if(h.get(a[i-k])==0) h.remove(a[i-k]);
            h.put(a[i],h.getOrDefault(a[i],0)+1);

            System.out.println(h.size());
        }
    }
}
