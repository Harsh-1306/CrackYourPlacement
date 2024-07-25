class Solution {
    public int getDecimalValue(ListNode head) {
        String s="";
        ListNode temp=head;
        while(temp!=null)
        {
            s+=Integer.toString(temp.val);
            temp=temp.next;
        }
        return Integer.parseInt(s,2);
    }
}