class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ans.add(nums[i]);
        }
       
        int low=0,mid=0,high=n-1;
        while(mid<=high)
        {
            if(ans.get(mid)==0)
            {
              int temp=ans.get(low);
              ans.set(low,ans.get(mid));
              ans.set(mid,temp);
              low++;
              mid++;
            }
            else if(ans.get(mid)==1)
            {
                mid++;
            }
            else
            {
                int temp=ans.get(mid);
                ans.set(mid,ans.get(high));
                ans.set(high,temp);
                high--;
            }
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=ans.get(i);
        }
    }
}