class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minSoFar){
                minSoFar = prices[i];
            }

            int ret = prices[i] - minSoFar;

            if(ret > maxProfit){
                maxProfit = prices[i] - minSoFar;
            }
        }

        return maxProfit;
    }
}
