class Solution {
    private int find(int ind,int buy,int[][]dp,int[]prices)
    {
        if(ind==prices.length)
        {
            return 0;
        }
        if(dp[ind][buy]!=-1)
        {
            return dp[ind][buy];
        }
        int profit=0;
        if(buy==1)
        {
           profit=Math.max(-prices[ind]+find(ind+1,0,dp,prices),find(ind+1,1,dp,prices));
        }
        else
        {
            profit=Math.max(prices[ind]+find(ind+1,1,dp,prices),find(ind+1,0,dp,prices));
        }
        return dp[ind][buy]=profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][]dp=new int[n][2];
        int buy=1;
        for(int[]rows:dp)
        {
            Arrays.fill(rows,-1);
        }
        return find(0,buy,dp,prices);
    }
}
