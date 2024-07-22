class Solution {
    public boolean isNumber(String s) {
        boolean digit=false,e=false,dot=false;
        int countoperator=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                digit=true;
            }
            else if(ch=='+' || ch=='-')
            {
                if(countoperator==2)
                {
                    return false;
                }
                if(i>0 && (s.charAt(i-1)!='e' && s.charAt(i-1)!='E'))
                {
                    return false;
                }
                if(i==s.length()-1)
                {
                    return false;
                }
                countoperator++;
            }
            else if(ch=='.')
            {
                if(e || dot)
                {
                    return false;
                }
                if(i==s.length()-1 && !digit)
                {
                    return false;
                }
                dot=true;
            }
            else if(ch=='e' || ch=='E')
            {
                if(e || !digit || i==s.length()-1)
                {
                    return false;
                }
                e=true;
            }
            else
            {
                return false;
            }


        }
        return true;
    }
}