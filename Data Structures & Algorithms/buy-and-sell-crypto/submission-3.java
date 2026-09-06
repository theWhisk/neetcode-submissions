class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int r = 0;

        for(int i = 0; i < prices.length - 1; i++){
            System.out.println("i: " + i);
            System.out.println("prices i:" + prices[i]);
            r = i;

            while(r < prices.length-1){
                r++;
                System.out.println("r:" + r);
                int ret = prices[r] - prices[i];
                System.out.println("prices r:" + prices[r]);
                System.out.println(ret);
                if(ret > maxProfit){
                    maxProfit = ret;
                }
            }
        }

        return maxProfit;
    }
}
