class Solution {
    private void addcomb(int open,int close,String s,int n,List<String>ans)
    {
        if(open==close && open+close==n*2)
        {
            ans.add(s);
            return;
        }
        if(open<n)
        {
            addcomb(open+1,close,s+"(",n,ans);
        }
        if(close<open)
        {
            addcomb(open,close+1,s+")",n,ans);
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        addcomb(0,0,"",n,ans);
        return ans;
    }
}