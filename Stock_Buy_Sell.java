public class Stock_Buy_Sell {
    public int maxProfit(int[] prices) {
        int Max_profit = 0;
        int best_buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > best_buy) {
                Max_profit = Math.max(Max_profit, prices[i]-best_buy);
            }
            best_buy = Math.min(best_buy, prices[i]);
        }
        return Max_profit;
    }
    public static void main(String[] args) {
        int[] price = { 7, 1, 5, 3, 6, 4 };
        Stock_Buy_Sell obj = new Stock_Buy_Sell();
        System.out.println("Max Profit is " + obj.maxProfit(price));
    }
}
