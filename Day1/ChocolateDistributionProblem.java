class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int mini=Integer.MAX_VALUE;
        for(int i=0;(i+m-1)<n;i++)
        {
            int cost=a.get(i+m-1)-a.get(i);
            mini=Math.min(mini,cost);
        }
        return mini;
    }
}