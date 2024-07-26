/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode middle(ListNode head)
    {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode reverse(ListNode head)
    {
        ListNode prev=null,pres=head,newnode=pres.next;
        while(pres!=null)
        {
            pres.next=prev;
            prev=pres;
            pres=newnode;
            if(newnode!=null)
            {
                newnode=newnode.next;
            }
        }
        head=prev;
        return head;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middle(head);
        ListNode secondhead=reverse(mid);
        while(head!=null && secondhead!=null)
        {
            if(head.val!=secondhead.val)
            {
                break;
            }
            head=head.next;
            secondhead=secondhead.next;
        }
        if(head==null || secondhead==null)
        {
            return true;
        }
        return false;
    }
}