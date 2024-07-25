static int missingNumber(int arr[], int size)
{
    // Your code here
    for(int i=0;i<size;i++)
    {
        int currind=arr[i]-1;
        while(0<=currind && currind<=size-1 && arr[i]!=arr[currind])
        {
            int temp=arr[i];
            arr[i]=arr[currind];
            arr[currind]=temp;
            currind=arr[i]-1;
        }
    }
    for(int i=0;i<size;i++)
    {
        if(arr[i]!=i+1)
        {
            return i+1;
        }
    }
    return size+1;
}