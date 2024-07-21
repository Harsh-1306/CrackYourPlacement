class Solution {
    private boolean ispal(String s)
    {
        int i=0,j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l=s.length();
        if(l==1)
        {
            return true;
        }
        if(ispal(s))
        {
            return true;
        }
        int i=0,j=l-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                break;
            }
            i++;
            j--;
        }
        StringBuilder s1=new StringBuilder(s);
        StringBuilder s2=new StringBuilder(s);
        s1.deleteCharAt(i);
        s2.deleteCharAt(j);
        return ispal(s1.toString()) || ispal(s2.toString());
    }
}