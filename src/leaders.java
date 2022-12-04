public class leaders {

    public static void main(String[] args){
        int[] a={7,10,4,2,8,3};
        int large=a[a.length-1];
        System.out.println(large);
        for (int i = a.length-2; i >0 ; i--) {
            if(a[i]>large){
                large=a[i];
                System.out.println(a[i]);
            }
        }
    }
}
