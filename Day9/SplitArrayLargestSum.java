class Solution {
    private int find(int[]nums,int pages)
    {
       int students=1;
       long pagesStudent=0;
       for(int i=0;i<nums.length;i++)
       {
        if(pagesStudent+nums[i]<=pages)
        {
            pagesStudent+=nums[i];
        }
        else
        {
            students++;
            pagesStudent=nums[i];
        }
       }
       return students;

    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        if(k>n)
        {
            return -1;
        }
     int max=nums[0];
     for(int i=1;i<n;i++)
     {
        if(nums[i]>max)
        {
            max=nums[i];
        }

     }
     int low=max;
     int sum=0;
     for(int i=0;i<n;i++)
     {
        sum+=nums[i];
     }
     int high=sum;
     while(low<=high)
     {
        int mid=(low+high)/2;
        int count=find(nums,mid);
        if(count>k)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
     }
     return low;
    }
}