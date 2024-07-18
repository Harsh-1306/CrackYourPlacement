class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int ele=nums[i];
            int more=target-ele;
            if(map.containsKey(more))
            {
                ans[0]=map.get(more);
                ans[1]=i;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}