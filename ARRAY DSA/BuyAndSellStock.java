public class BuyAndSellStock {
    public static int Buy_Sell_Stock(int price[]) {
        int buyPrice = Integer.MAX_VALUE; // + infinit
        int maxprofit = 0;

        for(int i=0; i<price.length; i++) { // 7, 1, 5, 3, 6, 4
            if(buyPrice < price[i]) { // profit
                int profit = price[i] - buyPrice; // today's profit // i=2 --> 5-1=4 // i=3 --> 3-1=2 // i=4 --> 6-1=5 // i=5 --> 4-1=3
                maxprofit = Math.max(maxprofit, profit); //Global Profit ,// i=2 --> 4 // i=3 --> 4>2 --> 4 // i=4 --> 5>4 --> 5 // i=5 --> 5>3 --> 5
            } else {
                buyPrice = price[i]; // 7, 1
            }
        }
        return maxprofit;
    }


    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        System.out.println("your maximum profit will : "+ Buy_Sell_Stock(price));
    }
}
