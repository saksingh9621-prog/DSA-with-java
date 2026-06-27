package Arrays;

public class BuySell {
    public static void buy_sell(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprice=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>buyprice){
                int profit=prices[i]-buyprice;
                maxprice=Math.max(maxprice,profit);
            }else{
                buyprice=prices[i];
            }
        }
        System.out.println(maxprice);
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        buy_sell(prices);
    }
}
