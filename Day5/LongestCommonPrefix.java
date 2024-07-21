class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int ind=0;
        int n=Math.min(s1.length(),s2.length());
        while(ind<n)
        {
            if(s1.charAt(ind)==s2.charAt(ind))
            {
                ind++;
            }
            else
            {
                break;
            }
        }
        return s1.substring(0,ind);
    }
}
