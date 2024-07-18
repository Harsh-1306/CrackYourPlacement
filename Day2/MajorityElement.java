class Solution {
    public int majorityElement(int[] nums) {
        int count=0,ele=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(count==0)
            {
                count=1;
                ele=nums[i];
            }
            else if(ele==nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        int count2=0;
        for(int i=0;i<n;i++)
        {
            if(ele==nums[i])
            {
                count2++;
            }
        }
        if(count2>(n/2))
        {
            return ele;
        }
        return -1;
    }
}