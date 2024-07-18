class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      int n=nums.length;
        Arrays.sort(nums);
        Set<List<Integer>>s=new HashSet<>();
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {for(int j=i+1;j<n;j++)
        {
            int k=j+1,l=n-1;
            while(k<l)
            {
                long sum=nums[i];
                sum+=nums[j];
                sum+=nums[k];
                sum+=nums[l];
                if(sum==target)
                {
                    s.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                    k++;
                    l--;
                }
                else if(sum<target)
                {
                    k++;
                }
                else
                {
                    l--;
                }
            }
        }
     
    }
          ans.addAll(s);
    return ans;
    }
}