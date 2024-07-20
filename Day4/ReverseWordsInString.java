class Solution {
    public String reverseWords(String s) {
      String arr[]=s.split(" ");
      String ans="";
      for(int i=arr.length-1;i>=0;i--)
      {
        if(arr[i]!="")
        {
            ans+=arr[i];
            ans+=" ";
        }
      }
      String s2="";
      for(int i=0;i<ans.length()-1;i++)
      {
       s2+=ans.charAt(i);
      }
      return s2;    
    }
}