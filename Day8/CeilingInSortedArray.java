public class CeilingInSortedArray {
    int ans=-1;
    public int ceil(int[]arr,int n,int ele)
    {
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>=ele)
            {
                ans=arr[mid];
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}
