class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length,profit=0,mini=prices[0];
        for(int i=1;i<n;i++)
        {
            int cost=prices[i]-mini;
            profit=Math.max(cost,profit);
            mini=Math.min(mini,prices[i]);
        }
        return profit;
    }
}