public class stockbuynsell {

    public static void main(String[] args){
        int[] price = {1,5,3,8,12};
        int profit=0;
        for (int i = 1; i < price.length; i++) {
            if(price[i]>price[i-1])
                profit+=price[i]-price[i-1];
        }
        System.out.println(profit);;
    }
}
