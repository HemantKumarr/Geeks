import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class moreThanN_Koccur {

    public static void main(String[] args){
        Integer[] a = {30,10,20,20,10,20,30,30};
        int k=4, n=a.length;
        optimize(a);
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int x:a) {
            h.put(x,h.getOrDefault(x,0) +1);
        }
        for(Map.Entry<Integer,Integer> e : h.entrySet())
            if(e.getValue()>n/k){
                System.out.println(e.getKey());
            }
        naive(a);

    }

    private static void optimize(Integer[] a) {
        int k=4, n=a.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int x:a ) {
            if(h.containsKey(x)){
                h.put(x,h.get(x)+1);
            }
            else if(h.size()<k){
                h.put(x,1);
            }
            else{
                for(Map.Entry<Integer,Integer> e : h.entrySet()){
                    Integer c = (Integer)e.getValue();
                    h.put((Integer)e.getKey(),c-1);
                    if(e.getValue()==0){
                        h.remove(e.getKey());
                    }
                }
            }
        }
        for(Map.Entry<Integer,Integer> e : h.entrySet()){
            if(e.getValue()>n/k)
                System.out.println(e.getKey());
        }

    }

    private static void naive(Integer[] a) {
        int k=4,n=a.length,count=1;
        Arrays.sort(a);
        for (int i = 1; i <a.length ; i++) {
            if(a[i]==a[i-1]){
                count++;
            }
            if(count>n/k){
                System.out.println(a[i-1]);
                count=1;
            }
        }
    }
}
