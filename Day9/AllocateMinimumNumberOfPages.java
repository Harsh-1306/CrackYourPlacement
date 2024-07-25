private static int find(int[]nums,int pages)
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
public static long findPages(int n, int[] arr, int m) {
    // Your code here
    
          
    if(m>n)
    {
        return -1;
    }
 int max=arr[0];
 for(int i=1;i<n;i++)
 {
    if(arr[i]>max)
    {
        max=arr[i];
    }

 }
 int low=max;
 int sum=0;
 for(int i=0;i<n;i++)
 {
    sum+=arr[i];
 }
 int high=sum;
 while(low<=high)
 {
    int mid=(low+high)/2;
    int count=find(arr,mid);
    if(count>m)
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