import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class frequencyOfEle {
    public static void main(String[] args){
        Integer[] a = {2,5,5,1,1,4,4}; // datatype is not primitive int, but object Integer
        HashMap<Integer,Integer> h = new HashMap<>();
        for (Integer x:a) {
            h.put(x, h.getOrDefault(x,0)+1); // getOrDefault returns the value of key 'x' if present else sets the default value as 0(in this case)
        }
        for (Map.Entry<Integer, Integer> e : h.entrySet()) {
            System.out.println(e.getKey()+ " "+ e.getValue());
        }
        h.put(10,3);
        System.out.println(h.get(10)); // returns the value of key 10
        System.out.println("----------");

// Linked hash map can be used to print the output in a certain order, lets say print the elements in the order of their 1st appearance.
// Normal hash map dont keep elements in any order.

        for (int i = 0; i <a.length ; i++) {
            boolean flag = false;
            for (int j = 0; j <i ; j++) {
                if(a[i].equals(a[j])){      // a is an Integer object hence an equals() call is used, == can also be used
                    flag=true;
                    break;
                }
            }
            if(flag) continue;
            int freq=1;
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]==a[j]) freq++;
            }
            System.out.println(a[i]+ " " + freq);
        }
    }
}
