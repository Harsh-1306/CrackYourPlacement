class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0,rightsum=0,maxsum=0;
        for(int i=0;i<k;i++)
        {
            leftsum+=cardPoints[i];
            
        }
        maxsum=leftsum;
        int rightind=cardPoints.length-1;
        for(int i=k-1;i>=0;i--)
        {     leftsum-=cardPoints[i];
              rightsum+=cardPoints[rightind];
              maxsum=Math.max(maxsum,leftsum+rightsum);
              rightind--;
        }
        return maxsum;
    }
}
