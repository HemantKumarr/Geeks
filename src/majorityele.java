public class majorityele {

    public static void main(String[] args){
        int[] a={1,3,2,3,2,6,2,8,9,2,2,2,7,7};
        int res=0,count=1; // finding majority element using moore's algo
        for (int i = 1; i <a.length ; i++) {
            if(a[res]==a[i])count++;
            else count--;
            if (count==0){
                res=i;
                count=1;
            }
        }
        System.out.println(a[res]);
        int majority=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[res]==a[i]) {
                majority++;
            }
        }
        if(majority>a.length/2){
            System.out.println(majority+ " "+ a[res]);
        }
        else System.out.println("no majority");
    }
}
