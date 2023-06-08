import java.util.Scanner;
/*  Better Algorithm 
 * public static int maxProfit(int[] prices) {
        int sell = Integer.MAX_VALUE;
        int profit = 0;
        int temp_profit = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < sell){
                sell = prices[i];
            }
            temp_profit = prices[i] - sell;
            if(profit < temp_profit){
                profit = temp_profit;
            }
        }
        return profit;
    }
*/


public class Buy_Sell_Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] t1 = new int [] {7,1,5,3,6,4};
        int [] t2 = new int [] {7,6,4,3,1};
        System.out.println(maxProfit(t1));
        System.out.println(maxProfit(t2));
        sc.close();
    }

    public static int maxProfit(int[] prices) {
        int indexBuy = 0; // Index where user Buys
        int indexSell = 0 ; // Index to Sell (Cannot Buy and Sell on same day)
        int profit = 0; // Profit
        for (indexBuy = 0; indexBuy<prices.length-1;indexBuy++){
            for (indexSell = indexBuy+1; indexSell<prices.length;indexSell++){
                if (profit < prices[indexSell]-prices[indexBuy]){
                    profit = prices[indexSell]-prices[indexBuy];
                }
            }
        }

        return profit;
    }
}
