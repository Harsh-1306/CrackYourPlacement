class Solution {
    int mod=(int)(Math.pow(10,9)+7);
    private int find(String s1,String s2,int ind1,int ind2,int[][]dp)
    {    if(ind2<0)
        {
            return 1;
        }
        if(ind1<0)
        {
            return 0;
        }
       
        if(dp[ind1][ind2]!=-1)
        {
            return dp[ind1][ind2];
        }
        if(s1.charAt(ind1)==s2.charAt(ind2))
        {
            int leave=find(s1,s2,ind1-1,ind2-1,dp);
            int stay=find(s1,s2,ind1-1,ind2,dp);
            return dp[ind1][ind2]=(leave+stay)%mod;
        }
        else
        {
            return dp[ind1][ind2]=find(s1,s2,ind1-1,ind2,dp);
        }
    }
    public int numDistinct(String s, String t) {
        int n=s.length(),m=t.length();
        int[][]dp=new int[n][m];
        for(int[]row:dp)
        {
            Arrays.fill(row,-1);
        }
        return find(s,t,n-1,m-1,dp);
    }
}