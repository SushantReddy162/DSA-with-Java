package Arrays;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices){
        int lowest = prices[0];
        int maxProfit = 0;

        for(int price:prices){
            lowest = Math.min(lowest , price);
            int currProfit = price - lowest;
            maxProfit = Math.max(maxProfit,currProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int maxprofit = maxProfit(prices);

        System.out.println(maxprofit);
    }
}
