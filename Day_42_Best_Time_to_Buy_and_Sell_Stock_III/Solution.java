class Solution {
    public int maxProfit(int[] prices) {
        int firstBuy = Integer.MAX_VALUE;
        int firstSell = 0;
        int secondBuy = Integer.MAX_VALUE;
        int secondSell = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < firstBuy) {
                firstBuy = prices[i];
            }
            if (prices[i] - firstBuy > firstSell) {
                firstSell = prices[i] - firstBuy;
            }
            if (prices[i] - firstSell < secondBuy) {
                secondBuy = prices[i] - firstSell;
            }
            if (prices[i] - secondBuy > secondSell) {
                secondSell = prices[i] - secondBuy;
            }
        }

        return secondSell;
    }
}
