class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int index=n/2;
        int sum=0;
        int median=nums[index];
        for(int i=0;i<n;i++)
        {
            sum+=Math.abs(nums[i]-median);
        }
        return sum;
    }
}
