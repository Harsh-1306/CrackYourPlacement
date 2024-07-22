class Solution {
    public int calculate(String s) {
        
        Stack<Integer> st = new Stack<>();
        int num=0;
        char op = '+';
        int cur =0;
       
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                cur=(cur*10)+(c - '0');
            }
            if(!Character.isDigit(c) & c != ' ' || i==s.length()-1){
                if(op=='+'){ 
                st.push(cur);
                }else if(op=='-'){ 
                st.push(-cur);
                }else if(op=='*'){ 
                st.push(st.pop()*cur);
                }else if(op=='/'){ 
                st.push(st.pop()/cur);}
            
            cur=0;
            op=c;
           
        }}
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}