
class Solution {
    static void perm(ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>ds,ArrayList<Integer>arr,int n,boolean[]vis)
    {
        if(ds.size()==n)
        {
            if(ans.contains(ds))
            {
                return;
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                vis[i]=true;
                ds.add(arr.get(i));
                perm(ans,ds,arr,n,vis);
                ds.remove(ds.size()-1);
                vis[i]=false;
            }
        }
    }
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>ds=new ArrayList<>();
        boolean[]vis=new boolean[n];
        perm(ans,ds,arr,n,vis);
        return ans;
    }
};