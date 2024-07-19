public class Solution {
    public int maxArea(int[] height) {
        int lp=0,
        rp=height.length-1;
        int maxarea=0;
        while(lp<rp)
        {
            int left=height[lp];
            int right=height[rp];
            int area=Math.min(left,right)*(rp-lp);
            maxarea=Math.max(maxarea,area);
            if(left<right)
            {
                lp++;

            }
            else
            {
                rp--;
            }
        }
        return maxarea;
    }
} {
    
}
