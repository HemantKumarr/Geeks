public class frequency {

    public static void main(String[] args){

        int []a={10,20,30,40,40,40,40};
        int count=1;
        for (int i = 1; i <a.length ; i++) {
            if(a[i]==a[i-1]){
                count++;
            }
            else{
            System.out.println(a[i-1]+ " " + count);
            count=1;
            }
        }
        System.out.println(a[a.length-1]+ " " + count);
    }
}
